package array;

public class SearchTarget {
    static int targetSearch(int[] arr, int target){
        int st = 0, end = arr.length-1;
        while (st <= end){
            int mid = st + (end-st)/2;
            if (arr[mid] == target) return mid;
            else if (target < arr[mid]) end = mid - 1;
            else st = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {14, 32, 45, 57, 79};

        System.out.println(targetSearch(arr, 57));

    }
}
