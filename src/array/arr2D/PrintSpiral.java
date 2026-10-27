package array.arr2D;

import java.util.Scanner;

public class PrintSpiral {
    static void printMatrix(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void spiralOrder(int[][] mat, int r, int c){
        int topRow = 0;
        int bottomRow = r-1;

        int leftColumn = 0;
        int rightColumn = c-1;

        int totalElements = 0;

        while(totalElements < r * c){
            // topRow --> leftCol to rightCol
            for(int j = leftColumn; j <= rightColumn; j++){
                System.out.print(mat[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            // rightCol --> topRow to bottomRow
            for(int i = topRow; i <= bottomRow; i++){
                System.out.print(mat[i][rightColumn] + " ");
                totalElements++;
            }
            rightColumn--;

            // bottomRow --> rightCol to leftCol
            for(int j = rightColumn; j >= leftColumn; j--){
                System.out.print(mat[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            // leftCol --> bottomRow to topRow
            for(int i = bottomRow; i >= topRow; i--){
                System.out.print(mat[i][leftColumn] + " ");
                totalElements++;
            }
            leftColumn++;
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

        spiralOrder(arr, r, c);
//        printMatrix(arr);

        sc.close();
    }
}
