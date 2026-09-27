package collectionFramework.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HW {
    public static void main(String[] args) {
        List<Student> stu = new ArrayList<>();

        stu.add(new Student(1, "Mukul"));
        stu.add(new Student(2, "Ashoka"));
        stu.add(new Student(3, "Devendra"));
        stu.add(new Student(4, "Rahul"));
        stu.add(new Student(5, "Kingfisher"));

        Comparator<Student> sortStudent = Comparator.comparing(s -> s.rolNo);

        stu.sort(sortStudent);

        System.out.println("After Sort with roll and name");
        for (Student s : stu){
            System.out.println(s.toString());
        }

        List<String> students = new ArrayList<>();

        System.out.println("Extract only names into a new List ");
        for (Student s : stu){
            students.add(s.name);
        }

        System.out.println(students);
    }
}
