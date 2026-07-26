package collectionFramework.comparable;

public class Student implements Comparable<Student> {
    int roll;
    String name;
    int marks;

    Student(int roll, String name, int marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    // neg -> no swap
    // pos -> swap
    // zero -> objects are equal
    //    [A, B, C]

    @Override
    public int compareTo(Student that){

//        return this.roll - that.roll;

        if (this.roll < that.roll) {
            return -1;
        }else {
            return 1;
        }
    }
}
