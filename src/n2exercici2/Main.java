package n2exercici2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	/*
	 * Modifica l'apartat anterior de manera que els arguments del mètode genèric siguin una llista 
	 * d'arguments de variable indefinida.
	 */


	Persona personData = new Persona("WILSON", "LI", 18);
	String ciudad = "London";
	double distancia = 4444.2;

	
	GenericMethods personDataSet= new GenericMethods(); // instance the object
	
	
	// add variables to the generic ArrayList
	personDataSet.addArgumentsMethodGeneric(personData);
	personDataSet.addArgumentsMethodGeneric(ciudad);
	personDataSet.addArgumentsMethodGeneric(distancia);
	
	//print
	personDataSet.verTresArgumentsMethodGeneric();
	
	

	}

}
