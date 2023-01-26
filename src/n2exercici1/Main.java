package n2exercici1;

public class Main {

	public static void main(String[] args) {
		/*
		 * Modifica l'exercici anterior de manera que un dels arguments del mètode genèric no sigui genèric.
		 */


		Persona personData = new Persona("WILSON", "LI", 18);
		String ciudad = "London";
		double distancia = 4444.2;

		GenericMethods<Object> personDataSet = new GenericMethods<Object>();

		personDataSet.setTresArgumentsMethod(ciudad,personData, distancia);

	}

}
