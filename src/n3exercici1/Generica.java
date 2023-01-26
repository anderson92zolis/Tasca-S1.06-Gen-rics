package n3exercici1;

public class Generica<T>{
	
	public static <T extends Telefon> void methodGenericPhone(T telefono) {
		telefono.trucar();
		// telefono.ferFotos();   it cann't be, there is not a method in the interface
		};
		
	public static <T extends Smartphone> void methodGenericSmartphone(T smartphone) {
		smartphone.trucar();
		smartphone.ferFotos();
		}

}
