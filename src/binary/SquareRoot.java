package binary;

public class SquareRoot {
    static int perfectSquare(int n){
        int ans = -1;
        int st = 0, end = n;

        while(st <= end){
            int mid = st + (end - st)/2;
            long val = (long) mid*mid;
            if(val == (long)n){
                return mid;
            } else if(val < (long) n){
                ans = mid;
                st = mid+1;
            }else {
                end = mid-1;
            }
        }

        return ans;
    }
    static void main() {
        int ans = perfectSquare(17);
        System.out.println("ANS: " + ans);
    }
}
