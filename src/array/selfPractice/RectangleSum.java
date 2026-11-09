package array.selfPractice;
import java.util.Scanner;

public class RectangleSum {
    // Calculate row-wise prefix sum
    static void prefixRow(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array[i].length; j++){
                array[i][j] += array[i][j-1];
            }
        }
    }

    // calculate row with col-wise prefix sum
    static void prefixCol(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array[i].length; j++){
                array[i][j] += array[i][j-1];
            }
        }

        for(int j = 0; j <  array[0].length; j++){
            for(int i = 1; i < array.length; i++){
                array[i][j] += array[i-1][j];
            }
        }
    }

    static int findRectSum(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        for(int i = l1; i <= l2; i++){
            for(int j = r1; j <= r2; j++){
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    static int findRectSum2(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;

        for(int i = l1; i <= l2; i++){
            if(r1 >= 1) {
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            }
            sum += matrix[i][r2];
        }

        return sum;
    }

    static int findRectSum3(int[][] matrix, int l1, int r1, int l2, int r2){
        int totalSum = 0;
        int upperSum = 0, leftSum = 0, upperLeft = 0;

        prefixCol(matrix);

        totalSum = matrix[l2][r2];
        if(l1 >= 1) {
            upperSum = matrix[l1 - 1][r2];
        }
        if(r1 >= 1) {
            leftSum = matrix[l2][r1 - 1];
        }
        if(l1 >= 1 && r1 >= 1) {
            upperLeft = matrix[l1-1][r1-1];
        }

        int ans = totalSum - upperSum - leftSum + upperLeft;

        return ans;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter L1 and R1: ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();

        System.out.print("Enter L2 and R2: ");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int sum = findRectSum(matrix, l1, r1, l2, r2);
        int sum3 = findRectSum3(matrix, l1, r1, l2, r2);
        System.out.println(sum);
        System.out.println(sum3);


        sc.close();
    }
}
