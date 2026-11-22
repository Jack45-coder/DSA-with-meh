package recursion;

import java.util.Scanner;

public class Fibonacci {
    private static int fib(int n) {
        // Base Case
        if (n == 0 || n == 1) return n;
        // subproblems
        int prev = fib(n-1);
        int prevPrev= fib(n-2);
        // self work
        return prev + prevPrev;
    }
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nth term for FibonacciSeries: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(fib(i));
        }

        sc.close();
    }
}
