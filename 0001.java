// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     return new int[] { i, j };
//                 }
//             }
//         }
//         throw new IllegalArgumentException("No solution found");
//     }
// }

// Done using hashmap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        // storing all values with their indexes
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // check for each number if the no another exist for sum to be equal to target
        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];

            if (map.containsKey(another) && map.get(another) != i) {
                return new int[] { i, map.get(another) };
            }
        }
        // not possible but have to give so that no jvaa error
        return new int[] {};
    }
}
