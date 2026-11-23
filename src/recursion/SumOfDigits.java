package recursion;

import java.util.Scanner;

public class SumOfDigits {
    static int sumOfDigits(int n){
        // baseCase
        if(n >= 0 && n <= 9) return n;

        // recursive work ---> small ans
        int smallAns = sumOfDigits(n/10);

        // self work
        int ans = smallAns + (n % 10);

        return ans;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits: ");
        int n =  sc.nextInt();

        System.out.println(sumOfDigits(n));
    }
}
