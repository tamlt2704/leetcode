import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void test1() {
        int[] result = new TwoSum().twoSum(new int[]{2,7,11,15}, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void test2() {
        int[] result = new TwoSum().twoSum(new int[]{3,2,4}, 6);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void test3() {
        int[] result = new TwoSum().twoSum(new int[]{3, 3}, 6);
        assertArrayEquals(new int[]{0, 1}, result);
    }
}
