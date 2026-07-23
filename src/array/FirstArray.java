package array;

public class FirstArray {
    public static void main(String[] args) {
        // Declare
        int arr[] = new int[5];
        System.out.println("Value at 0th index: " +arr[0]);

        // Insert
        arr[0] = 5;
        System.out.println("after, insert at 0th index: "+arr[0]);

        // Updated
        arr[0] = 3;
        System.out.println("after, update at 0th index: "+arr[0]);

        // Deleted
        // soft delete
        arr[0] = 0;
        System.out.println("after, delete at 0th index: "+arr[0]);

        // traverse
        int len = arr.length;
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Length id array is: "+len);

        for (int i = 0; i < len; i++){
            System.out.print(arr[i] + " ");
        }
    }
}