package n2exercici1;

public class Persona {
	
	private String nom;
	private String cognom;
	private int edad;
	
	// Create a class constructor for the Persona class
	
	public Persona(String nom, String cognom, int edad) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.edad = edad;
	}
	
	//setters&getters
	
	public String getNom() {
		return nom;
	}

	public String getCognom() {
		return cognom;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		
		return "Clase Persona data "+ nom + cognom + ", edad=" + edad ;
	}

		
}
