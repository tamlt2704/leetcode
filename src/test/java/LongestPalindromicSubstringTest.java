import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromicSubstringTest {
    LongestPalindromicSubstring.Solution solution = new LongestPalindromicSubstring().new Solution();

    @Test
    public void test1() {
        String s = "babad";
        assertEquals("bab", solution.longestPalindrome(s));
    }

    @Test
    public void test2() {
        String s = "cbbd";
        assertEquals("bb", solution.longestPalindrome(s));
    }

    @Test
    public void test3() {
        String s = "a";
        assertEquals("a", solution.longestPalindrome(s));
    }

    @Test
    public void test4() {
        String s = "ac";
        assertEquals("a", solution.longestPalindrome(s));
    }
}
