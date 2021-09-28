import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToIntegerAtoiTest {
    StringToIntegerAtoi.Solution solution = new StringToIntegerAtoi().new Solution();

    @Test
    public void test1() {
        assertEquals(42, solution.myAtoi("42"));
        assertEquals(-42, solution.myAtoi("-42"));
        assertEquals(4193, solution.myAtoi("4193 with words"));
        assertEquals(0, solution.myAtoi("words and 987"));
        assertEquals(-2147483648, solution.myAtoi("-91283472332"));
        assertEquals(0, solution.myAtoi(""));
        assertEquals(1, solution.myAtoi("1"));
        assertEquals(1, solution.myAtoi("+1"));
        assertEquals(0, solution.myAtoi("00000-42a1234"));
        assertEquals(3, solution.myAtoi("3.14159"));
        assertEquals(-12, solution.myAtoi("  -0012a42"));
        assertEquals(0, solution.myAtoi("+"));
    }
}
