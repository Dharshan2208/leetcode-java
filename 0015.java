class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        // Map<Integer, Integer> map = new HashMap<>();
        Set<List<Integer>> set = new HashSet<>();

        // for (int i = 0; i < n; i++) {
        //     map.put(nums[i], i);
        // }

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i == j)
        //             continue;

        //         int another = 0 - nums[i] - nums[j];

        //         if (map.containsKey(another) && map.get(another) != i && map.get(another) != j) {
        //             List<Integer> arr = new ArrayList<Integer>();
        //             arr.add(nums[i]);
        //             arr.add(nums[j]);
        //             arr.add(another);

        //             Collections.sort(arr);
        //             set.add(arr);

        //         }
        //     }
        // }

        // return new ArrayList<>(set);

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    List<Integer> arr = new ArrayList<Integer>();
                    arr.add(nums[i]);
                    arr.add(nums[left]);
                    arr.add(nums[right]);

                    Collections.sort(arr);
                    set.add(arr);

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
            }

        }

        return new ArrayList<>(set);
    }
}