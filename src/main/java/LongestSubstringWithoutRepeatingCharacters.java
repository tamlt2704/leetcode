import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int maxLength = 0;
            int start = 0, end = 0;
            Set<Character> slidingWindow = new HashSet<>();

            while (end < s.length()) {
                if (!slidingWindow.contains(s.charAt(end))) {
                    slidingWindow.add(s.charAt(end++));
                    maxLength = Math.max(maxLength, slidingWindow.size());
                } else {
                    slidingWindow.remove(s.charAt(start++));
                }
            }

            return maxLength;
        }
    }
}
