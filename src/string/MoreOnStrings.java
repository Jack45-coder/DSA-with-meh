package string;

import java.lang.reflect.Type;
import java.util.Scanner;

public class MoreOnStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word");
        String word1 = sc.next();
//        int word1 = sc.nextInt();
        System.out.println("Enter a word please");
        String word2 = sc.next();

        System.out.println("Enter a line");
        String line1 = sc.nextLine();

        System.out.println("Enter a next line");
        String line2 = sc.nextLine();

        System.out.print("word1: "+word1+",");
        System.out.print("word2: "+word2+",");
        System.out.print("line1: "+line1+",");
        System.out.print("line2: "+line2+",");


        System.out.println("Jackey" + 64 + 99.89); // Jackey6499.89
        System.out.println(64 + 99.89 + "Jackey"); // 163.89Jackey
        System.out.println("Jackey" + (64 + 99.89)); // Jackey163.89
        System.out.println((64 + 99.89)+ "Jackey"); // 163.89Jackey

        String cal = 64 + 99.89 + "Jackey";
        System.out.println(cal);

        String name = "Mohan Kumar";
        int roll = 37;
        System.out.println("My name is: " + name + ", roll number is: " +roll);

        // string formatting:-
        double num = 67.8675437;
        System.out.println(num); //67.8675437
        System.out.printf("Number is %.2f", num); // Number is 67.87

        String address = "India";
        String naam = String.format("Number is %2$f address is %1$s", address, num);
        System.out.println(naam);


    }
}