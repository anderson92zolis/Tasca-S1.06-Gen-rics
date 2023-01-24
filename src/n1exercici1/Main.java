package n1exercici1;

public class Main {
	
    public static void main(String[] args) {
    	/*
    	 * Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix
    	 * tipus, juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un
    	 * constructor per a inicialitzar els tres. Comprova que els arguments es poden posar en
    	 * qualsevol posició en la crida al constructor.
    	 */
    	
    	Students studentA= new Students("A",15);
    	Students studentB= new Students("B",18);
    	Students studentC= new Students("C",24);
    	
        NoGenericMethods myNoGenericMethods = new NoGenericMethods(
        		studentA,
        		studentB,
        		studentC);
        
        NoGenericMethods yourNoGenericMethods = new NoGenericMethods(
        		studentC,
        		studentB,
        		studentA);

        System.out.println("Students-> "+myNoGenericMethods);
        System.out.println("Students-> "+yourNoGenericMethods);
    }
}