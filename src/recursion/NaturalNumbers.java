package recursion;

import java.util.Scanner;

public class NaturalNumbers {
    // print 1 to n
    private static void printNaturalNum(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printNaturalNum(n-1);
        System.out.println(n);
    }

    // print n to 1
    private static void printNatural(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printNatural(n-1);
    }

    void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n =  input.nextInt();

        printNaturalNum(n);

        input.close();
    }
}
