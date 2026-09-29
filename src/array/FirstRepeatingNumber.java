package array;

import java.util.Scanner;

public class FirstRepeatingNumber {
    public int firstRepeatingNumber(int[] arr){
        int size = arr.length;

        for(int i = 0; i < size; i++){
            for (int j = i+1; j < size; j++){
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

        FirstRepeatingNumber firstRepeatingNumber = new FirstRepeatingNumber();
        int firstRepeating = firstRepeatingNumber.firstRepeatingNumber(arr);

        System.out.println("first repeating number: " +firstRepeating);
    }
}
