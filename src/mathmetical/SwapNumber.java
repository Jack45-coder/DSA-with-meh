package mathmetical;

public class SwapNumber {
    public static void swap(int a, int b){

        System.out.println("Before swap: " + a + " , " + b);
        int temp = 0;
        temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: " + a + " , " + b);
    }

    public static void swap2(int a, int b){
        System.out.println("Before swap: " + a + " , " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: " + a + " , " + b);
    }


    public static void main(String[] args) {
        int a = 9;
        int b = 6;

        swap(a, b);
        swap2(a, b);
    }
}
