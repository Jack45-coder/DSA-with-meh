package array.selfPractice;

import java.util.Scanner;

public class RotateArray {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println();
    }

    static void reverse(int[] arr, int st, int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }
    }

    static void rotateToRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n-k-1); // reverse 1st part 0 to n-k-1
        reverse(arr, n-k, n-1); // reverse 2nd part
        reverse(arr, 0, n-1); // reverse full part 0 to n-1

    }

    static void rotateToLeft(int[] arr, int k) {
      int n = arr.length;
      k = k % n;

      reverse(arr, 0, k-1);
      reverse(arr, k, n-1);
      reverse(arr, 0, n-1);

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter query: ");
        int q = sc.nextInt();

        while (q != 0) {
            System.out.print("Enter index at which element you want to rotate: ");
            int k = sc.nextInt();

//            rotateToRight(arr, k);
            rotateToLeft(arr, k);
            printArray(arr);
            q--;
        }
        sc.close();

    }
}
