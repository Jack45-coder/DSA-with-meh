package array.a2;

import java.util.Scanner;

public class Demo {
    static void printArray(int[][] arr){
        System.out.println("Your 2D Array");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers of row: ");
        int r = sc.nextInt();
        System.out.print("Enter numbers of col: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println(STR."Enter \{r * c} elements");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        printArray(arr);

        sc.close();
    }
}
