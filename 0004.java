class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] nums = new int[length];

        int i = 0, j = 0, k = 0;


        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1
        while (i < nums1.length) {
            nums[k++] = nums1[i++];
        }


        while (j < nums2.length) {
            nums[k++] = nums2[j++];
        }


        if (length % 2 == 1) {
            return nums[length / 2];
        } else {

            int mid1 = nums[length / 2];
            int mid2 = nums[length / 2 - 1];
            return (mid1 + mid2) / 2.0;
        }
    }
}