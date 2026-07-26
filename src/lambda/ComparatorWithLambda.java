package lambda;

import collectionFramework.comparable.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorWithLambda {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Amit", 50));
        students.add(new Student(4, "Ravi", 70));
        students.add(new Student(1, "Mukul", 40));
        students.add(new Student(5, "Rahul", 60));
        students.add(new Student(2, "Naina", 75));

//        Collections.sort(students, (s1, s2) -> {
//            return s2.marks - s1.marks;
//        });

        Collections.sort(students, (s1, s2) -> s2.marks - s1.marks);

        Collections.sort(students, (s1, s2) -> {
            if (s1.marks != s2.marks){
                return s2.marks - s1.marks;
            }
            return s1.name.compareTo(s2.name);
        });





        for(Student student : students){
            System.out.println("Name: " + student.name + " | Marks: " + student.marks);
        }
    }
}
