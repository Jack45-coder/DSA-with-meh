package array.a2;

import java.util.Scanner;

public class MatrixProb {
    static void printArray(int[][] arr){
        System.out.println("Your 2D Array");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void addition2Matrix(int[][] arr, int r1, int c1, int[][] arr2, int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Wrong Input - Addition not possible");
            return;
        }

        int[][] sum = new int[r1][c1];

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                sum[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        printArray(sum);
    }

    static void multiplication2Matrix(int[][] arr, int r1, int c1, int[][] arr2, int r2, int c2){
        if(c1 != r2){
            System.out.println("Wrong Dimensions - Multiplication not possible");
            return;
        }

        int[][] res = new int[r1][c2];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                for(int k = 0; k < c1; k++){
                    res[i][j] = arr[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("Multiplication of 2 matrices");
        printArray(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers of row of matrix_1: ");
        int r = sc.nextInt();
        System.out.print("Enter numbers of col of matrix_1: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println(STR."Enter \{r * c} elements of matrix_1");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter numbers of row of matrix_2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter numbers of col of matrix_2: ");
        int c2 = sc.nextInt();

        int[][] arr2 = new int[r2][c2];

        System.out.println(STR."Enter \{r2 * c2} elements of matrix_2");
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

//        addition2Matrix(arr, r, c, arr2, r2, c2);
          multiplication2Matrix(arr, r, c, arr2, r2, c2);
        sc.close();
    }
}
