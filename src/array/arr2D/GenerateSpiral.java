package array.arr2D;

import java.util.Scanner;

public class GenerateSpiral {
    static void printMatrix(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralMatrix(int n){
        int[][] spiral = new int[n][n];

        int topRow = 0;
        int bottomRow = n-1;

        int leftCol = 0;
        int rightCol = n-1;

        int curr = 1;

        while (curr <= n*n){

            // topRow
            for(int j = leftCol; j <= rightCol && curr <= n*n; j++){
               spiral[topRow][j] = curr++;

            }
            topRow++;

           // rightCol
            for(int i = topRow; i <= bottomRow && curr <= n*n; i++){
                spiral[i][rightCol] = curr++;
            }
            rightCol--;

            // bottomRow
            for(int j = rightCol; j >= leftCol && curr <= n*n; j--){
                spiral[bottomRow][j] = curr++;
            }
            bottomRow--;

            //leftCol
            for(int i = bottomRow; i >= topRow && curr <= n*n; i--){
                spiral[i][leftCol] = curr++;
            }
            leftCol++;
        }


        return spiral;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[][] genSpiral = generateSpiralMatrix(n);
        printMatrix(genSpiral);

        sc.close();
    }
}
