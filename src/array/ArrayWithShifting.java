package array;

public class ArrayWithShifting {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 2;
        arr[3] = 7;
        arr[4] = 17;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        insertWithShift(arr, 10, 2);

        System.out.println("\nAfter insert Shift");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        deleteWithShift(arr, 2);
        System.out.println("\nAfter delete Shift");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Insert WIth Shift
    public static void insertWithShift(int[] arr, int element, int index){
        int len = arr.length;
        if (index < 0 || index > len){
            System.out.println("Index out of bound");
            return;
        }
        for (int i = len-2; i >= index; i--){
            arr[i+1] = arr[i];
        }
        arr[index] = element;
    }

    // Delete WIth Shift
    public static void deleteWithShift(int[] arr, int index){
        int len = arr.length;
        if (index < 0 || index > len){
            System.out.println("Index out of bound");
            return;
        }
        for (int i = index+1; i < len; i++){
            arr[i-1] = arr[i];
        }
        arr[len-1] = 0;
    }
}