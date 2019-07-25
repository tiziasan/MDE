package it.univaq.disim.mde;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
/*import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.engine.parser.AtlParser;*/
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

/*import MM_uncertainty.Feature;
import MM_uncertainty.MM_uncertaintyFactory;
import MM_uncertainty.Metamodel;
import VariabilityFM.VariabilityModel;
import anatlyzer.atl.model.ATLModel;
import anatlyzer.atl.util.ATLSerializer;
import anatlyzer.atlext.ATL.ATLPackage;
import anatlyzer.atlext.ATL.Binding;
import anatlyzer.atlext.ATL.Callable;
import anatlyzer.atlext.ATL.SimpleOutPatternElement;
import anatlyzer.atlext.OCL.Attribute;
import anatlyzer.atlext.OCL.OclExpression;
import anatlyzer.atlext.OCL.OclFeature;
import anatlyzer.atlext.OCL.OclType;
import anatlyzer.atlext.OCL.Operation;*/

import family.*;
import webapp1.*;
import mde.*;
import mde.impl.MdeFactoryImpl;
import mde.impl.MdePackageImpl;
import mde.util.MdeAdapterFactory;

public class Main {

	public static void main(String[] args) {
		MdePackage mdePackage = MdePackageImpl.init();

		try {
			System.out.println(getSimpleOutPattern(mdePackage));
			
			System.out.println("Fine");
			
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Errore");
		}

	}

	public static List<Context> getSimpleOutPattern(MdePackage mdePackage) throws ParserException {
		System.out.println("EXTRACTING CALLABLE ELEMENTS FROM A ATL MODEL");
		// DEFINE OCL AND HELPER
		OCL<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, Constraint, EClass, EObject> ocl;
		OCLHelper<EClassifier, ?, ?, Constraint> helper;

		// INSTANCIATE OCL
		ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		// INSTANCIATE NEW HELPER FROM OCLEXPRESSION
		helper = ocl.createOCLHelper();
		// SET HELPER CONTEXT
		helper.setContext(MdePackage.eINSTANCE.getContext()); // ???

		// CREATE OCLEXPRESSION
		OCLExpression<EClassifier> expression = helper.createQuery("Context.allInstances()");
		// CREATE QUERY FROM OCLEXPRESSION
		Query<EClassifier, EClass, EObject> query = ocl.createQuery(expression);

		// EVALUATE OCL
		HashSet<Object> success = (HashSet<Object>) query.evaluate(mdePackage.getContext());
		List<Context> callableMethods = new ArrayList<Context>();
		for (Object object : success)
			callableMethods.add((Context) object);
		System.out.println("EXTRACTED CALLABLE ELEMENTS FROM A ATL MODEL");
		return callableMethods;

	}

	/*
	 * public static void printCallable(HashMap<OclFeature, OclType>
	 * callableElements) { Iterator<Entry<OclFeature, OclType>> iterator =
	 * callableElements.entrySet().iterator(); while (iterator.hasNext()) {
	 * Entry<OclFeature, OclType> a = iterator.next(); if (a.getKey() instanceof
	 * Attribute) { Attribute ch = ((Attribute) a.getKey());
	 * System.out.println("att " + ch); } if (a.getKey() instanceof Operation) {
	 * Operation sh = ((Operation) a.getKey()); System.out.println("ope " + sh); } }
	 * }
	 */

}
