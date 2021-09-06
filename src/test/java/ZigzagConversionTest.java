import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZigzagConversionTest {
    ZigzagConversion.Solution solution = new ZigzagConversion().new Solution();

    @Test
    public void test1() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        assertEquals("PAHNAPLSIIGYIR", solution.convert(s, numRows));
    }

    @Test
    public void test2() {
        String s = "A";
        int numRows = 1;
        assertEquals("A", solution.convert(s, numRows));
    }
}
