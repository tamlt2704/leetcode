import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {
    LongestSubstringWithoutRepeatingCharacters.Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
    /*
    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.
     */
    @Test
    public void test1() {
        String s = "abcabcbb";
        assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

    /*
    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.
     */
    @Test
    public void test2() {
        String s = "bbbbb";
        assertEquals(1, solution.lengthOfLongestSubstring(s));
    }

    /*
    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
    @Test
    public void test3() {
        String s = "pwwkew";
        assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

    /*
    Input: s = ""
    Output: 0
     */
    @Test
    public void test4() {
        String s = "";
        assertEquals(0, solution.lengthOfLongestSubstring(s));
    }
}
