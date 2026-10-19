package array;

import java.util.Scanner;

public class Demo {
    static void printArray(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; i++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        sc.close();
    }
}
