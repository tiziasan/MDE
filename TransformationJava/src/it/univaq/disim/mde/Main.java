package it.univaq.disim.mde;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import family.FamilyFactory;
import family.FamilyPackage;
import family.family;
import mde.EditorSelector;
import mde.MdePackage;

public class Main {

	public static void main(String[] args) {
		FamilyFactory familyFactory = FamilyFactory.eINSTANCE;
		
		
		System.out.println(familyFactory.eAllContents());
		
		
	}

	
	
}
