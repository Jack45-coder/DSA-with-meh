package array;

public class My2dArray {
    public static void main(String[] args) {
        int[][] matrix = new int[3][2];

        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int r = 0; r < rows; r++){
            for (int c = 0; c < cols; c++){
                matrix[r][c] = 10;
            }
        }

        for (int r = 0; r < rows; r++){
            for (int c = 0; c < cols; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

        // update
        matrix[1][1] = 20;

        System.out.println("After update");
        for (int r = 0; r < rows; r++){
            for (int c = 0; c < cols; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println("printing 1st row");
        int subArray[] = matrix[1];
        int len = subArray.length;
        for (int i = 0; i < len; i++){
            System.out.print(subArray[i]+ " ");
        }

    }
}
