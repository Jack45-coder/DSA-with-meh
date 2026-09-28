package array;

public class FindUnique {
    public int findUnique(int[] arr){
        int length = arr.length;

        for (int i = 0; i < length-1; i++){
            for (int j = i+1; j < length-1; j++){
                if (arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int unique = -1;
        for (int i = 0; i < length-1; i++){
            if(arr[i] > 0){
                unique = arr[i];
            }
        }

        return unique;
    }

    public static void main(String[] args) {
        FindUnique findUnique = new FindUnique();

        int[] arr = {1, 3, 2, 4, 3, 2, 1};

        int unique = findUnique.findUnique(arr);
        System.out.println("unique element in an array: " +  unique);
    }
}
