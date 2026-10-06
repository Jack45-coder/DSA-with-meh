package array.twoPointerApproach;

import java.util.Scanner;

public class SortArray {
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // swapArray
    public static void swap(int[] arr, int left, int right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
    }

    // reverse
    public static void reverse(int[] arr){
        int st = 0;
        int end = arr.length - 1;
        while (st < end){
            swap(arr, st, end);
            st++;
            end--;
        }
    }

    // inPlace (Counting method)
    public static void sortZerosAndOne(int[] arr){
        int n = arr.length;
        int zeros = 0;

        for (int i = 0; i < n; i++){
            if (arr[i] == 0){
                zeros++;
            }
        }

        for (int i = 0; i < zeros; i++){
            arr[i] = 0;
        }
        for (int i = zeros; i < n; i++){
            arr[i] = 1;
        }
    }

    // inPlace Optimised (Two-pointer approach)
    public static void sortZerosAndOneOptimised(int[] arr){
        int st = 0;
        int end = arr.length-1;
        while (st < end){
            // Swap only when left is 1 and right is 0
            if(arr[st] == 1 && arr[end] == 0){
                swap(arr, st, end);
                st++;
                end--;
            }
            if (arr[st] == 0){
                st++;
            }
            if (arr[end] == 1){
                end--;
            }
        }
    }

    // Sorts array such that all even numbers appear before all odd numbers
    public static void sortOddAndEven(int[] arr){
        int st = 0;
        int end = arr.length-1;

        while (st < end){
            // If left is odd and right is even, swap them
            if(arr[st]%2 != 0  && arr[end]%2 == 0){
                swap(arr, st, end);
                st++;
                end--;
            }
            // If left is already even, move left pointer forward
            if (arr[st]%2 == 0){
                st++;
            }
            // If right is already odd, move right pointer backward
            if (arr[end]%2 != 0){
                end--;
            }
        }
    }

    // sortSquares with reverse method
    public static int[] sortSquared(int[] arr){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int[] ans = new int[n];
        int k = 0; // Left-to-right start

        // 1. Fill elements in descending order (largest squares first)
        while (st <= end){
            if (Math.abs(arr[st]) > Math.abs(arr[end])){
                ans[k++] = arr[st]*arr[st];
                st++;
            }else {
                ans[k++] = arr[end]*arr[end];
                end--;
            }
        }

        // 2. Reverse the 'ans' array to make it ascending order
        reverse(arr);

        // 3. Print and return the sorted array
        printArray(ans);
        return ans;
    }

    // Optimized sortSquared (fills from right to left for ascending order)
    public static int[] sortSquaredII(int[] arr){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int[] ans = new int[n];
        int k = n-1; // right-to-left start

        while (st <= end){
            if (Math.abs(arr[st]) > Math.abs(arr[end])){
                ans[k--] = arr[st]*arr[st];
                st++;
            }else {
                ans[k--] = arr[end]*arr[end];
                end--;
            }
        }

        // 3. Print and return the sorted array
        printArray(ans);
        return ans;
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

        System.out.print("Original array: ");
        printArray(arr);
//        System.out.print("Sorted array: ");
//        sortZerosAndOneOptimised(arr);
//        printArray(arr);
//        sortOddAndEven(arr);
//        sortSquared(arr);
        System.out.print("Original array: ");
        sortSquaredII(arr);

        sc.close();
    }
}
