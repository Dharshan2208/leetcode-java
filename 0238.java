class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int ans[] = new int[nums.length];
        // // brute force
        // for(int i = 0;i<nums.length;i++){
        // int product = 1;
        // for (int j = 0;j<nums.length;j++){
        // if(i != j){
        // product *= nums[j];
        // }
        // }
        // ans[i] = product;
        // }

        // return ans;

        // in o(n) but sapce complexity is not good

        int n = nums.length;
        int ans[] = new int[n];
        int prefix[] = new int[n];
        int suffix[] = new int[n];

        // initalising value becoz nothing is there na so
        prefix[0] = 1;
        suffix[n - 1] = 1;

        // prefix
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // suffix
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        // ans
        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;

        // will do it in o(1) later 
    }
}