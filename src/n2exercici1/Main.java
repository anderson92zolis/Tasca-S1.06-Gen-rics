package n2exercici1;

public class Main {

	public static void main(String[] args) {
		/*
		 * Modifica l'exercici anterior de manera que un dels arguments del mètode genèric no sigui genèric.
		 */

		
		String ciudad = "London";
		Persona personData = new Persona("WILSON", "LI", 18);
		double distancia = 4444.2;
		
		GenericMethods personDataSet = new GenericMethods(); //corrección, instanciamos normalmente

		personDataSet.setTresArgumentsMethod(ciudad,personData, distancia);

	}

}
