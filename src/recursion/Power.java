package recursion;

import java.util.Scanner;

// find the value p^q using a recursive function
public class Power {
    static int pow(int p, int q){
        if(q == 0) return 1;

        return pow(p, q-1) * p;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of P: ");
        int p = sc.nextInt();
        System.out.print("Enter value of Q: ");
        int q = sc.nextInt();

        int ans = pow(p, q);
        System.out.println(ans);
    }
}
