package collectionFramework.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(30);
        list.add(70);
        list.add(90);
        list.add(17);
        list.add(49);

        list.remove(2);
        list.remove(Integer.valueOf(30));

        ListIterator listIterator = list.listIterator();

        System.out.println("...");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("Reverse");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        System.out.println("Enhance for loop");
        for (Integer num : list){
            System.out.println(num);
        }

        List<Student> stu = new ArrayList<>();

        stu.add(new Student(1, "Mukul"));
        stu.add(new Student(2, "Ashoka"));
        stu.add(new Student(3, "Devendra"));
        stu.add(new Student(4, "Rahul"));
        stu.add(new Student(5, "Kingfisher"));

        stu.remove(new Student(3, "Devendra"));

        for (Student s : stu){
            System.out.println(s.toString());
        }

        System.out.println("Size: " + list.size());

        System.out.println("For Loop");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i) + ",");
        }

        System.out.println("After sort");
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i) + ",");
        }


        // HW: student -> sort increasing order of rollNo

    }
}
