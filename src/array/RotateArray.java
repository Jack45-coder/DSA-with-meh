package array;

import java.util.Scanner;

public class RotateArray {
    public static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for(int i = n-k; i < n; i++){
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n-k; i++){
            ans[j++] = arr[i];
        }

        return ans;
    }

    public static void reverse(int[] arr, int st, int end){
        while (st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }
    }

    public static void rotateInPlace(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1); // reverse 1st part
        reverse(arr, n-k, n-1); // reverse 2nd part
        reverse(arr, 0, n-1); // reverse full array

    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(STR."\{arr[i]} ");
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of arr: ");
        int s = sc.nextInt();
        int[] arr = new int[s];

        System.out.println(STR."Enter \{s} elements:");
        for (int i = 0; i < s; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("times of rotate: ");
        int k = sc.nextInt();
        rotateInPlace(arr, k);
//        int[] rotateArr = rotate(arr, k);
        printArray(arr);
    }
}
