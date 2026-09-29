package array;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSum {
    public static int[] targetSum(int[] arr, int target){
        int size = arr.length;

        for (int i = 0; i < size; i++){
            for (int j = i+1; j < size; j++){
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
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

        System.out.println("Enter target: ");
        int target = sc.nextInt();

        int[] result = targetSum(arr, target);
        System.out.println(Arrays.toString(result));

    }
}
