public class MedianOfTwoSortedArrays {
    public double median(int[] arr) {
        int n = arr.length;
        boolean odd = n % 2 == 1;
        return odd ? arr[n / 2] : (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
    }

    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int mergedArrLength = nums1.length + nums2.length;
            boolean odd = mergedArrLength % 2 == 1;
            int medianEndPosition = mergedArrLength / 2;
            int i = 0, j = 0;
            int k = -1;
            int flag = 0;
            int arr[] = new int[2];
            while ((i < nums1.length) || (j < nums2.length)) {
                if ((i < nums1.length) && (j < nums2.length)) {
                    arr[flag] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
                } else if (i < nums1.length) {
                    arr[flag] = nums1[i++];
                } else if (j < nums2.length) {
                    arr[flag] = nums2[j++];
                }

                k++;
                if (k >= medianEndPosition) {
                    return odd ? arr[flag] : (arr[0] + arr[1]) / 2.0;
                }

                flag = 1 - flag;
            }
            return 0;
        }
    }
}
