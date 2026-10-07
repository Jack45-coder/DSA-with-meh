package array;

import java.util.Scanner;

public class RangeQuery {

    public static int[] makePrefixSum(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
           arr[i] += arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arrays length: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        System.out.println("Enter elements");
        for (int  i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }

        int[] prefSum = makePrefixSum(arr);

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0){
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r] - prefSum[l-1];

            System.out.println("Sum: " + ans);
        }

    }
}
