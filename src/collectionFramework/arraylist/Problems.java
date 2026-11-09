package collectionFramework.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Problems {
    static void reverseList(ArrayList<Integer> list) {
        int st = 0, end =  list.size() - 1;
        while (st < end) {
            int temp = list.get(st);
            list.set(st, list.get(end));
            list.set(end, temp);

            st++;
            end--;
        }
    }

    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list: "+ list.toString());
//        reverseList(list);
        Collections.reverse(list);
        System.out.println("Reverse list: " + list);

    }
}
