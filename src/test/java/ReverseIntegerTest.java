import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {
    ReverseInteger.Solution solution = new ReverseInteger().new Solution();

    @Test
    public void test1() {
        assertEquals(321, solution.reverse(123));
        assertEquals(-321, solution.reverse(-123));
        assertEquals(21, solution.reverse(120));
        assertEquals(0, solution.reverse(0));
        assertEquals(0, solution.reverse(1534236469));
    }
}
