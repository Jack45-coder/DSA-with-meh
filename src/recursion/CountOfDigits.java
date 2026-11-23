package recursion;

import java.util.Scanner;

public class CountOfDigits {
    static int countOfDigits(int n){
        // base case
        if(n == 1) return n;

        return 1 + countOfDigits(n/10);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits: ");
        int m = sc.nextInt();
        System.out.println(countOfDigits(m));
    }
}
