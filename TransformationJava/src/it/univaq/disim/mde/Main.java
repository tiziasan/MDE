package it.univaq.disim.mde;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import family.FamilyPackage;
import matching.ContextShape;
import matching.Match;
import matching.MatchingFactory;
import matching.Metaclass;
import mde.Context;
import mde.EditorSelector;
import mde.MdePackage;
import mde.Property;
import mde.PropertyTypes;
import webapp1.Webapp1Package;

public class Main {

	static String modelFilePathString = "Model" + File.separator + "EditorSelector.xmi";
	static String modelOutputFilePathString = "Model" + File.separator + "Match.xmi";
	static String outputFileFolderString = "/Users/fabio/git/MDE/TransformationJava/Output" + File.separator;

	static Match match;

	public static void main(String[] args) throws Exception {

		Webapp1Package webPackage = Webapp1Package.eINSTANCE;
		FamilyPackage famPackage = FamilyPackage.eINSTANCE;

		List<EObject> famMetaClasses = famPackage.eContents();
		List<EObject> webMetaClasses = webPackage.eContents();

		// queryModel("prova", 2, 0, 0, 0);
		createMatch();

		parseMetamodel(webMetaClasses);
		parseMetamodel(famMetaClasses);

		serializeModel();
		
	}

	

	private static void parseMetamodel(List<EObject> metaClasses) throws Exception {

		List<String> attributes = new ArrayList<String>();

		EClass metaClass;

		Integer integerCount = 0;
		Integer booleanCount = 0;
		Integer doubleCount = 0;
		Integer stringCount = 0;

		// for each content
		for (EObject eObject : metaClasses) {

			// cast to metaclass
			metaClass = (EClass) eObject;

			// System.out.println("********************");

			// System.out.println(metaClass.getName() + "\n");

			// for each metaclass
			if (!metaClass.isAbstract()) {

				for (EAttribute attribute : metaClass.getEAllAttributes()) {

					attributes.add(attribute.getName() + ' ' + attribute.getEType().getName());

					switch (attribute.getEType().getName()) {
					case "EString":
						stringCount += 1;
						break;

					case "EInt":
						integerCount += 1;
						break;

					case "EBoolean":
						booleanCount += 1;
						break;

					case "EDouble":
						doubleCount += 1;
						break;

					default:
						break;
					}

				}

				// output and clear the list
				queryModel(metaClass.getName(), stringCount, integerCount, booleanCount, doubleCount);

				createOutput(metaClass.getName(), attributes, stringCount, integerCount, booleanCount, doubleCount);
				attributes.clear();
				integerCount = 0;
				booleanCount = 0;
				doubleCount = 0;
				stringCount = 0;

			}

		}

	}

	private static void createOutput(String metaclassName, List<String> attributes, Integer stringCount,
			Integer integerCount, Integer booleanCount, Integer doubleCount) throws IOException {

		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileFolderString + metaclassName, true));

		for (String attribute : attributes) {

			writer.write(attribute);

			writer.newLine();

		}

		writer.newLine();

		writer.write("String: " + stringCount);
		writer.newLine();

		writer.write("Integer: " + integerCount);
		writer.newLine();

		writer.write("Boolean: " + booleanCount);
		writer.newLine();

		writer.write("Double: " + doubleCount);
		writer.newLine();

		writer.close();

	}

	private static void queryModel(String metaclassName, Integer stringCount, Integer integerCount,
			Integer booleanCount, Integer doubleCount) {
		
	

		Integer stringCountContext = 0;
		Integer integerCountContext = 0;
		Integer doubleCountContext = 0;
		Integer booleanCountContext = 0;

		EditorSelector editorSelector = load(modelFilePathString);

		for (Context context : editorSelector.getContexts()) {

			Metaclass metaclass;
			ContextShape contextShape;
			
			metaclass=createMetaclass(metaclassName);
			contextShape=createContextShape(context.getName());

			// System.out.println(context.getName());

			for (Property property : context.getProperties()) {

				switch (property.getDataType().getValue()) {
				case PropertyTypes.BOOLEAN_VALUE:
					booleanCountContext += 1;
					break;

				case PropertyTypes.DOUBLE_VALUE:
					doubleCountContext += 1;
					break;

				case PropertyTypes.INTEGER_VALUE:
					integerCountContext += 1;
					break;

				case PropertyTypes.STRING_VALUE:
					stringCountContext += 1;
					break;

				default:
					break;
				}

			}

			if (booleanCount <= booleanCountContext && doubleCount <= doubleCountContext
					&& integerCount <= integerCountContext && stringCount <= stringCountContext) {

				createReference(metaclass, contextShape);

				System.out.println(context.getName() + " is suitable for representing " + metaclassName);
			}else {
				
				createNoReference(metaclass, contextShape);
				
			}

			stringCountContext = 0;
			integerCountContext = 0;
			doubleCountContext = 0;
			booleanCountContext = 0;

		}

	}

	private static void createMatch() {

		match = MatchingFactory.eINSTANCE.createMatch();

	}

	private static ContextShape createContextShape(String name) {

		ContextShape contextShape = MatchingFactory.eINSTANCE.createContextShape();
		contextShape.setName(name);
		
		//match.setContextShapes(contextShape);

		return contextShape;
	}

	private static Metaclass createMetaclass(String metaclassName) {

		Metaclass metaclass = MatchingFactory.eINSTANCE.createMetaclass();
		metaclass.setName(metaclassName);

		//match.setMetaclasses(metaclass);
		
		return metaclass;
	}
	
	private static void createReference(Metaclass metaclass, ContextShape contextShape) {
		
		contextShape.setRepresents(metaclass);
		
		
		match.getContextShapes().add(contextShape);
		match.getMetaclasses().add(metaclass);
		
	}
	
	private static void createNoReference(Metaclass metaclass, ContextShape contextShape) {
		
		match.getContextShapes().add(contextShape);
		match.getMetaclasses().add(metaclass);
		
	}
	
	public static void serializeModel() {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createURI(modelOutputFilePathString));
		resource.getContents().add(match);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static EditorSelector load(String fileName) {

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		EPackage.Registry.INSTANCE.put(MdePackage.eNS_URI, MdePackage.eINSTANCE);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(fileName), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		EditorSelector editorSelector = (EditorSelector) resource.getContents().get(0);

		return editorSelector;
	}

}
