package array;

public class ReverseArray {
    public static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] reversed = new int[n];
        int j = 0;

        for (int i = n-1; i >= 0; i--){
             reversed[j++] = arr[i];
        }

        return reversed;
    }

    public static void revArray2(int[] arr){
        if(arr.length == 0){
            return;
        }

        int st = 0;
        int end = arr.length-1;

        while (st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] =temp;

            st++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1};
        int[] revArr = reverseArray(arr);

        System.out.println("Reversed Array with use new array: ");
        for (int i = 0; i < revArr.length; i++){
            System.out.print(revArr[i] + " ");
        }

        System.out.println();

        revArray2(arr);
        System.out.println("Reversed Array without use new array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
