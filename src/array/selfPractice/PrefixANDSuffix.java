package array.selfPractice;

import java.util.Scanner;

public class PrefixANDSuffix {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "\t ");
        }

        System.out.println();
    }

    static int[] makePrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];

        prefixSum[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        return prefixSum;
    }

    static int[] makeSuffixSum(int[] arr) {
        int n = arr.length;
        int[] suffixSum = new int[n];

        suffixSum[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            suffixSum[i] = suffixSum[i+1] +  arr[i];
        }

        return  suffixSum;
    }

    static void prefixInPlace(int[] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            arr[i] += arr[i-1];
        }
    }

    static void suffixInPlace(int[] arr){
        int n = arr.length;

        for(int i = n-2; i >= 0; i--){
            arr[i] += arr[i+1];
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

//        int[] prefSum = makePrefixSum(a);
//        int[] suffixSum = makeSuffixSum(a);

//        prefixInPlace(a);
        suffixInPlace(a);

        printArray(a);
        sc.close();
    }
}
