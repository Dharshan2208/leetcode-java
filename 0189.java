class Solution {
    public void rotate(int[] nums, int k) {

        // space is o(n) have to thinks of o(1) bruh...
        int n = nums.length;
        k = k % n;
        int[] newArr = new int[n];

        // place each element in new position
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            newArr[newIndex] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = newArr[i];
        }
    }
}