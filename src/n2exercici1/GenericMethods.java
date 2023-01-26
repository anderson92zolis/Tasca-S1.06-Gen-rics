package n2exercici1;

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
	
	public void setTresArgumentsMethod(String firstParameter, T secondParameter,T thirdParameter) {
		System.out.println(" un objecte de la classe "+firstParameter.getClass().getSimpleName() +",un "+ secondParameter.getClass().getSimpleName()+"  i un tipus  "+thirdParameter.getClass().getSimpleName());
		}
	
	@Override
	public String toString() {
		return "GenericMethods [first=" + first + ", second=" + second + ", third=" + third + "]";
	}	
	
	
}
	
