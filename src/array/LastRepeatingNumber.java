package array;

import java.util.Scanner;

public class LastRepeatingNumber {
    public static int lastRepeatingNumber(int[] arr){
        int size = arr.length;
        int ans = 0;

        for(int i = 0; i < size; i++){
            for (int j = i+1; j < size; j++){
                if (arr[i] == arr[j]){
                    ans = arr[i];
                }
            }
        }
        return ans;
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
