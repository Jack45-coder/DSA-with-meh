package array;

import java.util.Scanner;

public class LastRepeatingNumber {
    public static int lastRepeatingNumber(int[] arr){
        int size = arr.length;

        for(int i = size-1; i >= 0; i--){
            for (int j = i-1; j >= 0; j--){
                if (arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
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

        int lastRepeating = lastRepeatingNumber(arr);
        System.out.println("last repeating number: "+lastRepeating);
    }
}
