package n1exercici2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona personData = new Persona("WILSON", "LI", 18);
		String ciudad = "London";
		double distancia = 4444.2;

		GenericMethods personDataSet = new GenericMethods();

		personDataSet.setTresArgumentsMethod(personData, ciudad, distancia);

	}

}
