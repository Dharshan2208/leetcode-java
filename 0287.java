class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] hash = new int[100001];

        for (int i : nums) {
            hash[i]++;
            if (hash[i] > 1)
                return i;
        }
        return -1;
    }
}

// Have to do it again in O(1) sapce complexity