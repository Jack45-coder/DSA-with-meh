package patternPrinting;

public class RightAngledTrangle {
    public static void main(String[] args) {
        int r = 4;

        System.out.println("Right Angled Trangle");
        for (int i = 1; i <= r; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("Inverted Right Angled Trangle");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < (r-i); j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("Mirrored Right Angled Trangle");
        for (int i = 1; i <= r; i++){
            //spaces
            for (int j = 1; j <= (r-i); j++){
                System.out.print(" ");
            }
            //star
            for (int k = 1; k <= i; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("Number Based Right Angled Trangle");
        for (int i = 1; i <= r; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("Character Based Right Angled Trangle");
        for (int i = 0; i < r; i++){
            for (int j = 0; j <= i; j++){
                System.out.print((char)(65 + j));
            }
            System.out.println();
        }

        System.out.println("Floyd's Triangle");
        int num = 1;
        for (int i = 1; i <= r; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
