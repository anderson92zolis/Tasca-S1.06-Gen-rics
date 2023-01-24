package n1exercici1;

public class Students {

    private String name;
    private int edad;

    public Students(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }
    // getters
    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return " Students {" +
                "name= '" + name + '\'' +
                ", edad= " + edad +
                '}';
    }
}
