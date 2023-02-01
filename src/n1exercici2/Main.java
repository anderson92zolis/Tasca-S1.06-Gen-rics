package n1exercici2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona personData = new Persona("WILSON", "LI", 18);
		String ciudad = "London";
		double distancia = 4444.2;

		//GenericMethods<Object> personDataSet = new GenericMethods<Object>();
		
		GenericMethods personDataSet= new GenericMethods(); //corrección, se intancia normal
		

		personDataSet.setTresArgumentsMethod(personData, ciudad, distancia);

	}

}
