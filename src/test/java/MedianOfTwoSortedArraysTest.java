import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedianOfTwoSortedArraysTest {
    MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
    MedianOfTwoSortedArrays.Solution solution = medianOfTwoSortedArrays.new Solution();

    @Test
    public void testMedianMethod() {
        double median = medianOfTwoSortedArrays.median(new int[]{1, 2, 3});
        assertEquals(2.0, median, 0);

        median = medianOfTwoSortedArrays.median(new int[]{1, 2, 3, 4});
        assertEquals(2.5, median, 0);

        median = medianOfTwoSortedArrays.median(new int[]{0, 0, 0, 0});
        assertEquals(0, median, 0);
    }

    @Test
    public void test1() {
        assertEquals(2, solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0);
        assertEquals(2.5, solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 0);
        assertEquals(0, solution.findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0}), 0);
        assertEquals(3, solution.findMedianSortedArrays(new int[]{}, new int[]{1,2,3,4,5}), 0);
    }


}
