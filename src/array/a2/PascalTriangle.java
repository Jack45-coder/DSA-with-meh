package array.a2;

import java.util.Scanner;

public class PascalTriangle {
    static void printArray(int[][] arr){
        System.out.println("Your 2D Array");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n){
        int ans[][] = new int[n][];

        for (int i = 0; i < n; i++){
            // iTh row has i+1 columns
            ans[i] = new int[i+1];

            // 1st and last elements of every row is 1
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[][] pascal = pascal(n);
        printArray(pascal);

        sc.close();
    }
}
