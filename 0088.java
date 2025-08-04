import java.util.*;
class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        List<Integer> merged = new ArrayList<>();

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged.add(nums1[i]);
                i++;
            } else {
                merged.add(nums2[j]);
                j++;
            }
        }

        while (i < m) {
            merged.add(nums1[i]);
            i++;
        }
        while (j < n) {
            merged.add(nums2[j]);
            j++;
        }

        for (int k = 0; k < merged.size(); k++) {
            nums1[k] = merged.get(k);
        }
        return nums1;
    }
}