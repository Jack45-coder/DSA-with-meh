package recursion;

import java.util.Scanner;

public class Factorial {
    private static long factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        long ans = (long) n * factorial(n-1);
        return ans;
    }


    void main(){
        Scanner  sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(factorial(n));

        sc.close();
    }
}
