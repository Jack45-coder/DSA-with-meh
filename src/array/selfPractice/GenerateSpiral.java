package array.selfPractice;

import java.util.Scanner;

public class GenerateSpiral {
    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiral(int n){
        int[][] spiral = new int[n][n];

        int topRow = 0, bottomRow = n-1;
        int leftCol = 0, rightCol = n-1;
        int curr = 1;

        while(curr <= n*n){
            // topRow --> leftCol (0) to rightCol (n-1)
            for(int j = leftCol; j <= rightCol; j++){
                spiral[topRow][j] = curr++;
            }
            topRow++;

            // rightCol --> topRow (0) to bottomROw (n-1)
            for(int i = topRow; i <= bottomRow; i++){
                spiral[i][rightCol] = curr++;
            }
            rightCol--;

            // bottomRow --> rightCol (n-1) to leftCol (0)
            for(int j = rightCol; j >= leftCol; j--){
                spiral[bottomRow][j] = curr++;
            }
            bottomRow--;

            //leftCol --> bottomROw (n-1) to topRow (0)
            for(int i = bottomRow; i>= topRow; i--){
                spiral[i][leftCol] = curr++;
            }
            leftCol++;
        }

        return spiral;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of the 2D array m*n ");
        int n = sc.nextInt();
        int[][] spiral = new int[n][n];
        spiral = generateSpiral(n);
        printMatrix(spiral);

        sc.close();
    }
}
