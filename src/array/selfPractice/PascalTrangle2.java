package array.selfPractice;

import java.util.Scanner;

public class PascalTrangle2 {
    static void printArray(int[][] arr) {
        System.out.println("Your 2D Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

        static int[][] createPascal(int n) {
        int[][] pascal = new int[n][];

        for(int i = 0; i < n; i++){

            // iTh row has i+1 columns
            pascal[i] = new int[i+1];

            // 1st and last elements of every row is 1
            pascal[i][0] = pascal[i][i] = 1;

            for(int j = 1; j < i; j++){
                pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
            }
        }


        return pascal;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[][] pascal = createPascal(n);
        printArray(pascal);

        sc.close();
    }
}
