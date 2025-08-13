class Solution {
    public int firstMissingPositive(int[] nums) {
        // hardcoded like o(n) space or more not working for all the test cases on
        // submission
        // index out of bound exception
        // int hash[] = new int[100000];
        // int n = nums.length;
        // hash[0] = 0;
        // for (int i = 0; i < n; i++) {
        // if(nums[i] >= 0){
        // hash[nums[i]] ++;
        // }
        // }

        // for(int i = 1;i<hash.length;i++){
        // if(hash[i] == 0){
        // return i;
        // }
        // }
        // return -1;

        // Can be done using hashmap for easy but memory have to think other method
        Map<Integer, Boolean> map = new HashMap<>();

        for (int num : nums) {
            if (num > 0) {
                map.put(num, true);
            }
        }

        int smallest = 1;
        while (true) {
            if (!map.containsKey(smallest)) {
                return smallest;
            }
            smallest++;
        }


        // Got how to implement like the idea
        // first see we can do like we will make the index and value in the array same
        // we can ignore the negative and those which are more than n
        // if value dont match like the index and value
        // then thats the answer
        // will do the implementation ()not able to do rightnow)
    }
}