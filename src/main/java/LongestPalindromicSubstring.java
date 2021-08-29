import java.util.Arrays;

public class LongestPalindromicSubstring {
    class Solution {
        public String longestPalindrome(String s) {
            StringBuilder strBuilder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                strBuilder.append('#');
                strBuilder.append(s.charAt(i));
            }
            strBuilder.append('#');
            String newString = strBuilder.toString();

            int centerPosition = 0;
            int rightmostPosition = 0;
            int[] expansionLength = new int[newString.length()];
            //Arrays.fill(expansionLength, 0);

            for (int i = 0; i < newString.length(); i++){
                int iMirror = centerPosition - (i - centerPosition);
                if (i < rightmostPosition) {
                    expansionLength[i] = Math.min(expansionLength[iMirror], rightmostPosition - i);
                }

                int a = i + (1 + expansionLength[i]);
                int b = i - (1 + expansionLength[i]);
                while ((a < newString.length()) && (b >= 0) && (newString.charAt(a++) == newString.charAt(b--))) {
                    expansionLength[i]++;
                }

                if ((i + expansionLength[i]) > rightmostPosition) {
                    centerPosition = i;
                    rightmostPosition = i + expansionLength[i];
                }
            }

            int maxLen = 0;
            centerPosition = 0;
            for (int i = 0; i < newString.length(); i++) {
                if (expansionLength[i] > maxLen) {
                    maxLen = expansionLength[i];
                    centerPosition = i;
                }
            }

            return newString.substring(centerPosition-expansionLength[centerPosition], centerPosition+expansionLength[centerPosition]+1).replaceAll("#","");
        }
    }
}
