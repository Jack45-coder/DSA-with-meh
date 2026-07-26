package generic.boundedGen;

public class Student extends College {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void printName(){
        System.out.println("Student name printed: " + name);
    }

    public String toString(){
        return "Student Name: " + name + ", College: " + collegeName ;
    }
}
