class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int prefix = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        for (int i = 0; i < n; i++) {
            if (prefix == sum - prefix - nums[i]) {
                return i;
            }

            prefix += nums[i];
        }

        return -1;
    }
}