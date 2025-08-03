class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum_expected = 0;
        int sum_actual = 0;

        sum_expected = (n * (n + 1)) / 2;

        for (int num : nums) {
            sum_actual += num;
        }

        return sum_expected - sum_actual;
    }
}