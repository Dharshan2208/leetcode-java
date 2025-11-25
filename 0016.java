class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;

        Arrays.sort(nums);

        // Set<Integer> set = new HashSet<>();

        // for (int i = 0; i < n - 2; i++) {
        //     int left = i + 1;
        //     int right = n - 1;

        //     while (left < right) {
        //         int sum = nums[i] + nums[left] + nums[right];

        //         if (sum < target) {
        //             left++;
        //             set.add(sum);
        //         } else if (sum > target) {
        //             right--;
        //             set.add(sum);
        //         } else {
        //             return target;
        //         }
        //     }
        // }

        // int closest = Integer.MAX_VALUE;

        // for (int x : set) {
        //     if (Math.abs(x - target) < Math.abs(closest - target)) {
        //         closest = x;
        //     }
        // }

        // return closest;

        int closest = nums[0] + nums[1] + nums[2];
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < n-2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                int diffToTarget = Math.abs(sum - target);
                if(diffToTarget < minDifference){
                    closest = sum;
                    minDifference = diffToTarget;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return target;
                }
            }
        }

        return closest;
    }
}