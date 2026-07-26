package collectionFramework.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Amit", 50));
        list.add(new Student(4, "Ravi", 70));
        list.add(new Student(1, "Mukul", 40));
        list.add(new Student(5, "Rahul", 60));
        list.add(new Student(2, "Naina", 75));

        System.out.println("Before sorted");

        for (Student student : list){
            System.out.println("Roll N0: " + student.roll + " | Name: " + student.name);
        }

        System.out.println("After sorted");

        Collections.sort(list);
        for (Student student : list){
            System.out.println("Roll N0: " + student.roll + " | Name: " + student.name);
        }
    }
}
