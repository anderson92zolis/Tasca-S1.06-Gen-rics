package n2exercici2;

import java.util.ArrayList;

public class GenericMethods<T>  {
	
	private ArrayList<T> myArrayGeneric= new ArrayList<>();
	
	//constructor
	public GenericMethods() {}
	
	//GETTER&SETTERS	
	
	public ArrayList<T> getMyArrayGeneric() {
		return myArrayGeneric;
	}

	public void setMyArrayGeneric(ArrayList<T> myArrayGeneric) {
		this.myArrayGeneric = myArrayGeneric;
	}

	//METHOD
	
	public void addArgumentsMethodGeneric(T parameter) {
		myArrayGeneric.add(parameter);
	}
	
	public void verTresArgumentsMethodGeneric() {
		
		for (T argumentGenric:myArrayGeneric ) {
			System.out.println("llista d'arguments "+ argumentGenric);
			}
	}

	@Override
	public String toString() {
		return "GenericMethods [myArrayGeneric=" + myArrayGeneric + "]";
	}


}
	
