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
        int[] rotateArr = rotate(arr, k);
        printArray(rotateArr);
    }
}
