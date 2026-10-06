package array;

import java.util.Scanner;

public class PrefixSum {
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] makePrefixSumArr(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];

        for (int i = 1; i < n; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }

    public static void makePrefixSum(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++){
            arr[i] += arr[i-1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arrays length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int  i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

//        int[] pref = makePrefixSumArr(arr);
        makePrefixSum(arr);
        printArray(arr);

    }
}
