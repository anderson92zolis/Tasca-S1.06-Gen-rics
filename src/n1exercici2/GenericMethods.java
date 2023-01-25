package n1exercici2;

public class GenericMethods<T>  {
	
	private T primero;

	public GenericMethods() {
		this.primero = null;
	}
	
	public void setTresArgumentsMethod(T firstParameter, T secondParameter,T thirdParameter) {
		System.out.println(" un objecte de la classe "+firstParameter.getClass().getSimpleName() +",un "+ secondParameter.getClass().getSimpleName()+"  i un tipus  "+thirdParameter.getClass().getSimpleName());
		}
	
}
	
