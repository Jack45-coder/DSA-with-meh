package patternPrinting;

public class PyramidAndDiamond {
    public static void main(String[] args) {
        int r = 4;

        System.out.println("Centered Pyramid");
        // for row
        for (int i = 1; i <= r; i++) {
            //spaces
            for (int j = 1; j <= (r - i); j++) {
                System.out.print(" ");
            }
            //stars
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Diamond Pyramid");
        for (int i = 1; i <= r; i++) {
            //spaces
            for (int j = 1; j <= (r - i); j++) {
                System.out.print(" ");
            }
            //stars
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = (r-1); i >= 1; i--){
            //spaces
            for (int j = 1; j <= (r-i); j++){
                System.out.print(" ");
            }
            //star
            for (int k = 1; k <= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
