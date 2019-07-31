package it.univaq.disim.mde.matchingplugin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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

import editor.*;
import it.univaq.disim.mde.family.*;
import it.univaq.disim.mde.match.*;
import it.univaq.disim.mde.webapp.*;



public class Main {

	static String modelFilePathString = "Model" + File.separator + "EditorSelector.xmi";
	static String modelOutputFilePathString = "Match.xmi";
	//static String outputFileFolderString = "/Users/fabio/git/MDE/TransformationJava/Output" + File.separator;
	
	static Map<EClass, List<Context>> matchMap = new HashMap<EClass, List<Context>>();
	
	public static void main(String[] args) throws Exception {

		WebappPackage webPackage = WebappPackage.eINSTANCE;
		FamilyPackage famPackage = FamilyPackage.eINSTANCE;

		List<EObject> famMetaClasses = famPackage.eContents();
		List<EObject> webMetaClasses = webPackage.eContents();

		parseMetamodel(webMetaClasses);
		parseMetamodel(famMetaClasses);

		System.out.println(matchMap);
		
		
		buildMatchModel();
		
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

				//create entry for the metaclass in the map
				matchMap.put(metaClass, new ArrayList<Context>());
				
				queryModel(metaClass, stringCount, integerCount, booleanCount, doubleCount);

				//createOutput(metaClass.getName(), attributes, stringCount, integerCount, booleanCount, doubleCount);
				attributes.clear();
				integerCount = 0;
				booleanCount = 0;
				doubleCount = 0;
				stringCount = 0;

			}

		}

	}

//	private static void createOutput(String metaclassName, List<String> attributes, Integer stringCount,
//			Integer integerCount, Integer booleanCount, Integer doubleCount) throws IOException {
//
//		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileFolderString + metaclassName, true));
//
//		for (String attribute : attributes) {
//
//			writer.write(attribute);
//
//			writer.newLine();
//
//		}
//
//		writer.newLine();
//
//		writer.write("String: " + stringCount);
//		writer.newLine();
//
//		writer.write("Integer: " + integerCount);
//		writer.newLine();
//
//		writer.write("Boolean: " + booleanCount);
//		writer.newLine();
//
//		writer.write("Double: " + doubleCount);
//		writer.newLine();
//
//		writer.close();
//
//	}

	private static void queryModel(EClass metaclass, Integer stringCount, Integer integerCount,
			Integer booleanCount, Integer doubleCount) {
		
		Integer stringCountContext = 0;
		Integer integerCountContext = 0;
		Integer doubleCountContext = 0;
		Integer booleanCountContext = 0;

		EditorSelector editorSelector = load(modelFilePathString);

		for (Context context : editorSelector.getContexts()) {

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
				
				matchMap.get(metaclass).add(context);

				//System.out.println(context.getName() + " is suitable for representing " + metaclassName);
			}

			stringCountContext = 0;
			integerCountContext = 0;
			doubleCountContext = 0;
			booleanCountContext = 0;

		}

	}

//	private static void createMatch() {
//
//		match = MatchingFactory.eINSTANCE.createMatch();
//
//	}
//
//	private static ContextShape createContextShape(String name) {
//
//		ContextShape contextShape = MatchingFactory.eINSTANCE.createContextShape();
//		contextShape.setName(name);
//		
//		//match.setContextShapes(contextShape);
//
//		return contextShape;
//	}
//
//	private static Metaclass createMetaclass(String metaclassName) {
//
//		Metaclass metaclass = MatchingFactory.eINSTANCE.createMetaclass();
//		metaclass.setName(metaclassName);
//
//		//match.setMetaclasses(metaclass);
//		
//		return metaclass;
//	}
//	
//	private static void createReference(Metaclass metaclass, ContextShape contextShape) {
//		
//		contextShape.setRepresents(metaclass);
//		
//		
//		match.getContextShapes().add(contextShape);
//		match.getMetaclasses().add(metaclass);
//		
//	}
//	
//	private static void createNoReference(Metaclass metaclass, ContextShape contextShape) {
//		
//		match.getContextShapes().add(contextShape);
//		match.getMetaclasses().add(metaclass);
//		
//	}
//	
	
	private static void buildMatchModel() {
		//create root
		Root root = MatchFactory.eINSTANCE.createRoot();
		
		//for each entry in the map
		for (Map.Entry<EClass, List<Context>> entry : matchMap.entrySet()) {
			//create a match
			Match match = MatchFactory.eINSTANCE.createMatch();
			//set the metaclass reference
			match.setMetaclass(entry.getKey());
			//for each context in the list
			for (Context context : entry.getValue()) {
				//add shape reference 
				match.getShapes().add(context);
			}
			//insert the match in the root
			root.getMatches().add(match);
		}
		
		serializeModel(root);
		
	}
	
	private static void serializeModel(Root root) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createURI(modelOutputFilePathString));
		resource.getContents().add(root);

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

		EPackage.Registry.INSTANCE.put(EditorPackage.eNS_URI, EditorPackage.eINSTANCE);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(fileName), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		EditorSelector editorSelector = (EditorSelector) resource.getContents().get(0);

		return editorSelector;
	}

}
