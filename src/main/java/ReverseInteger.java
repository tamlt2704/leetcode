public class ReverseInteger {
    class Solution {
        public int reverse(int x) {
            long rev = 0;
            while (x != 0) {
                rev = rev * 10;
                rev = (x % 10) + rev;
                x = x / 10;
            }


            if ((int) Math.pow(-2, 31) <= rev && rev <= (int) Math.pow(2, 31) - 1) {
                return (int) rev;
            } else {
                return 0;
            }
        }
    }
}
