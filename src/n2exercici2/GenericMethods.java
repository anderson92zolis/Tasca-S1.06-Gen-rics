package n2exercici2;

import java.util.ArrayList;

public class GenericMethods<T>  {
	
	private String first;
	private T second;
	private T third;

	public GenericMethods() {
		first = null;
		second = null;
		third = null;
	}
	//GETTER&SETTERS	
	public String getFirst() {
		return first;
	}
	
	public T getSecond() {
		return second;
	}

	public T getThird() {
		return third;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public void setSecond(T second) {
		this.second = second;
	}

	public void setThird(T third) {
		this.third = third;
	}

	//METHOD
	
	public void setTresArgumentsMethod(ArrayList<T> argumentArrayList) {
		System.out.println("llista d'arguments de variable indefinida, amb mida de dades "+argumentArrayList.size() +" i tipus "+argumentArrayList.getClass().getSimpleName());
		
		for (T argumentGenric:argumentArrayList ) {
			System.out.println("llista d'arguments "+ argumentGenric);
;
			}
	}
	
	@Override
	public String toString() {
		return "GenericMethods [first=" + first + ", second=" + second + ", third=" + third + "]";
	}	
	
	
}
	
