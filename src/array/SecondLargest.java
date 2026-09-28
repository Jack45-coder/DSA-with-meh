package array;

import java.util.Scanner;

public class SecondLargest {
    public int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
                if (arr[i] > mx){
                    mx = arr[i];
                }
        }
        return mx;
    }

    public int nd2Max(int[] arr){
        int mx = findMax(arr);
        int n = arr.length;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = findMax(arr);

        return secondMax;
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

        SecondLargest secondLargest = new SecondLargest();
        int mx = secondLargest.findMax(arr);
        int secondMax = secondLargest.nd2Max(arr);


        System.out.println("Max in an array: " + mx);
        System.out.println("2ndMax in an array: " + secondMax);


    }
}
