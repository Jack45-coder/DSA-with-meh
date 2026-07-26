package generic.boundedGen;

public class Teacher extends College {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("Teacher name printed: " +name);
    }

    public String toString(){
        return "Teacher Name: " + name + ", College: " + collegeName ;
    }
}
