package it.univaq.disim.mde;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import mde.*;

public class Main {

	static String queryFileFolder = "Query" + File.separator;
	static String modelFilePathString = "Model" + File.separator + "EditorSelector.xmi";
	static String outputFileFolderString = "/Users/fabio/git/MDE/OclQueryPlugin/Output" + File.separator;

	public static void main(String[] args) throws Exception {

		List<String> queryFileList = new ArrayList<String>();
		List<String> queryList = new ArrayList<String>();
		List<Context> contextList = new ArrayList<Context>();


		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());
//
//	    EditorSelector editorSelector = load("Model/EditorSelector.xmi");
//	    
//	    
//	    try {
//		
//	    	getSimpleOutPattern(editorSelector).forEach(z -> System.out.println(z.getName()));
//		
//	    } catch (ParserException e) {
//			e.printStackTrace();
//		} 
		
		
		// get files in folder
		queryFileList = getQueryFiles(queryFileFolder);

		// for each file in folder
		for (String queryFile : queryFileList) {

			// read the queries inside the file
			queryList = getQueries(queryFile);

			// for each query
			for (String oclQuery : queryList) {

				// call the method for executing the query and get the result
				contextList = getSimpleOutPattern(oclQuery);

				// create an output file
				createOutput(queryFile, contextList);

			}
		}
 
	}

	private static List<String> getQueries(String queryFile) throws IOException {
		List<String> queryList = new ArrayList<String>();

		// read file line by line
		BufferedReader br = new BufferedReader(new FileReader(queryFileFolder + queryFile));

		String line;
		while ((line = br.readLine()) != null) {
			// if the line starts with "Query: " the line contains a query
			if (line.startsWith("Query: ")) {

				// second dimension queries
				queryList.add(line.replaceAll("Query: ", ""));

				// System.out.println(line);

			}

		}

		return queryList;
	}

	private static List<String> getQueryFiles(String folderString) {

		// get files in folder
		File folder = new File(folderString);
		File[] listOfFiles = folder.listFiles();

		List<String> filesList = new ArrayList<String>();

		// for each file in folder
		for (int i = 0; i < listOfFiles.length; i++) {

			// if is a file
			if (listOfFiles[i].isFile()) {

				filesList.add(listOfFiles[i].getName());

			}
		}

		return filesList;

	}

	public static EditorSelector load(String fileName) {
		EPackage.Registry.INSTANCE.put(MdePackage.eNS_URI, MdePackage.eINSTANCE);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(fileName), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		EditorSelector editorSelector = (EditorSelector) resource.getContents().get(0);

		return editorSelector;
	}

	public static List<Context> getSimpleOutPattern(String oclQuery) throws ParserException {

		EditorSelector editorSelector = load(modelFilePathString);

		// System.out.println("EXTRACTING CALLABLE ELEMENTS FROM A ATL MODEL");
		// DEFINE OCL AND HELPER
		OCL<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, Constraint, EClass, EObject> ocl;
		OCLHelper<EClassifier, ?, ?, Constraint> helper;

		// INSTANCIATE OCL
		ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		// INSTANCIATE NEW HELPER FROM OCLEXPRESSION
		helper = ocl.createOCLHelper();
		// SET HELPER CONTEXT
		helper.setContext(MdePackage.eINSTANCE.getContext());

		// CREATE OCLEXPRESSION
		OCLExpression<EClassifier> expression = helper.createQuery(oclQuery);
		// CREATE QUERY FROM OCLEXPRESSION
		Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);

		// EVALUATE OCL
		HashSet<Object> success = (HashSet<Object>) query.evaluate(editorSelector);
		List<Context> callableMethods = new ArrayList<Context>();
		for (Object object : success)
			callableMethods.add((Context) object);
		// System.out.println("EXTRACTED CALLABLE ELEMENTS FROM A ATL MODEL");
		return callableMethods;

	}

//	public static void getOCLQueries(String folderPath) throws Exception {
//
//		// get files in folder
//		File folder = new File(folderPath);
//		File[] listOfFiles = folder.listFiles();
//		String fileName;
//
//		List<String> filesList = new ArrayList<String>();
//		List<List<String>> queryList = new ArrayList<List<String>>();
//
//		// for each file in folder
//		for (int i = 0; i < listOfFiles.length; i++) {
//
//			// if is a file
//			if (listOfFiles[i].isFile()) {
//
//				fileName = listOfFiles[i].getName();
//
//				// System.out.println(listOfFiles[i].getName());
//				// read file line by line
//				BufferedReader br = new BufferedReader(new FileReader(listOfFiles[i]));
//				String line;
//				while ((line = br.readLine()) != null) {
//					// if the line starts with "Query: " the line contains a query
//					if (line.startsWith("Query: ")) {
//
//						// second dimension queries
//						queryList.add(index, element);
//
//						// System.out.println(line);
//
//					}
//
//				}
//
//				// filesList.add(listOfFiles[i].getName());
//
//			}
//
//		}
//
//	}

	public static void createOutput(String metaclassName, List<Context> contexts) throws IOException {
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileFolderString+metaclassName, true));
		
		for (Context context : contexts) {
			
			writer.write(context.getName());
			
			writer.newLine();
			
		}

		writer.close();

	}

}
