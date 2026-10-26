package array.arr2D;

import java.util.Scanner;

public class TransposeArr {
    static void printArr(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[1].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] makeTranspose(int[][] arr, int r, int c){
        int[][] trans = new int[c][r];

        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
                trans[i][j] = arr[j][i];
            }
        }

        return trans;
    }

    static void transposeInPlace(int[][] arr, int r, int c){
        if(r != c) return;

        for(int i = 0; i < r; i++){
            for(int j = i; j < c; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
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

        transposeInPlace(arr, r, c);
        printArr(arr);

//        int[][] trans = makeTranspose(arr, r, c);
//        printArr(trans);
    }
}
