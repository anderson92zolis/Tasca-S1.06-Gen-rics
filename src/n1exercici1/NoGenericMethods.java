package n1exercici1;

public class NoGenericMethods {

    private Students student1;
    private Students student2;
    private Students student3;

    public NoGenericMethods(Students student1, Students student2, Students student3) {
        this.student1 = student1;
        this.student2 = student2;
        this.student3 = student3;
    }
    //getters
    public Students getStudent1() {
        return student1;
    }

    public Students getStudent2() {
        return student2;
    }

    public Students getStudent3() {
        return student3;
    }

    //setters


    public void setStudent1(Students student1) {
        this.student1 = student1;
    }

    public void setStudent2(Students student2) {
        this.student2 = student2;
    }

    public void setStudent3(Students student3) {
        this.student3 = student3;
    }
    
	@Override
	public String toString() {
		return "NoGenericMethods ["+"\n"
				+", student1=" +student1 + "\n"
				+", student2=" +student2 + "\n"
				+", student3=" +student3 + "\n"
				+"]";
	}

    
}