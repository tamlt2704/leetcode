public class StringToIntegerAtoi {
    public class Solution {
        public int myAtoi(String s) {
            long intNumber = 0;
            int sign = 1;
            int i = 0;
            boolean hasCharacter = false;
            while ((i < s.length()) && ((s.charAt(i) == ' '))) i++;
            if (i > s.length() - 1) return 0;
            if (s.charAt(i) == '-') sign = -1;
            if ((s.charAt(i) == '-') || (s.charAt(i) == '+')) i++;
            while ((i < s.length()) && ((s.charAt(i) < '0') || (s.charAt(i) > '9'))) {
                i++;
                hasCharacter = true;
            }
            while ((i < s.length()) && (s.charAt(i) == '0')) i++;
            while (i < s.length()) {
                if ((s.charAt(i) < '0') || (s.charAt(i) > '9')) {
                    hasCharacter = true;
                    if (s.charAt(i) == '.') return (int) (sign * intNumber);
                } else {
                    if (hasCharacter) return (int) (sign * intNumber);
                    intNumber *=  10;
                    intNumber += (s.charAt(i) - '0');

                    if ((intNumber > Integer.MAX_VALUE) || (intNumber < Integer.MIN_VALUE)) {
                        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                }

                i++;
            }
            return (int) (sign * intNumber);
        }
    }
}
