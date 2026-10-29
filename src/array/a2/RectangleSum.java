package array.a2;

import java.util.Scanner;

public class RectangleSum {

    static void printArray(int[][] mat){
        for(int i=0;i < mat.length;i++){
            for(int j=0;j < mat[i].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void findPrefixMatrix(int[][] matrix) {
        int r = matrix.length;
        if (r == 0) return;
        int c = matrix[0].length;

        // traverse horizontally to calculate row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

    }

    // calculate row-wise and col-wise sum
    // matrix[i][j] = sumRectangle( (0, 0), (i, j) )
    static void findRowWithColPrefixMatrix(int[][] matrix){
        int r = matrix.length;
        if(r == 0) return;
        int c = matrix[0].length;

        // traverse horizontally to calculate row-wise prefix sum
        for(int i = 0; i < r; i++){
            for(int j = 1; j < c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

        // traverse vertically to calculate col-wise prefix sum
        for(int j = 0; j < c; j++){
            for(int i = 1; i < r; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }


    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;

        for(int i = l1; i <= l2; i++){
            for(int j = r1; j <= r2; j++){
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    static int findSum2(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        findPrefixMatrix(matrix);

        for(int i = l1; i <= l2; i++){
            // r1 to r2 sum for row 1
            if(r1 >= 1) {
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            }else {
                sum += matrix[i][r2];
            }
        }

        return sum;
    }

    static int findSum3(int[][] matrix, int l1, int r1, int l2, int r2){
        int ans = 0;
        findRowWithColPrefixMatrix(matrix);
        int  sum = 0, up = 0, left = 0, upLeft = 0;
        sum = matrix[l2][r2];
        if(l1 >= 1) {
            up = matrix[l1 - 1][r2];
        }
        if(r1 >= 1) {
            left = matrix[l2][r1-1];
        }
        if(l1 >= 1 && r1 >= 1) {
            upLeft = matrix[l1-1][r1-1];
        }
        ans = sum - up - left + upLeft;

        return ans;
    }


    static void main(String[] args) {
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

        System.out.print("Enter L1: ");
        int l1 = sc.nextInt();

        System.out.print("Enter R1: ");
        int r1 = sc.nextInt();

        System.out.print("Enter L2: ");
        int l2 = sc.nextInt();

        System.out.print("Enter R2: ");
        int r2 = sc.nextInt();



       int sum1 = findSum(arr, l1, r1, l2, r2);
       System.out.println("sum1: " + sum1);

//        int sum2 = findSum2(arr, l1, r1, l2, r2);
//        System.out.println("sum2: " + sum2);

        int sum3 = findSum3(arr, l1, r1, l2, r2);
        System.out.println("sum3: " + sum3);

        sc.close();
    }
}
