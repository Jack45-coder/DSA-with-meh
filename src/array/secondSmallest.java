package array;

import java.util.Scanner;

public class secondSmallest {
    public static int findSmallest(int[] arr){
        int size = arr.length;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int secondSmallest(int[] arr){
        int min = findSmallest(arr);
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
            }
        }

        int nd2Smallest = findSmallest(arr);
        return nd2Smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of arr: ");
        int s = sc.nextInt();
        int[] arr = new int[s];

        System.out.println("Enter " + s + " elements:");
        for (int i = 0; i < s; i++){
            arr[i] = sc.nextInt();
        }

        int nd2Smallest = secondSmallest(arr);
        System.out.println("second smallest number in an array: " +nd2Smallest);
    }
}
