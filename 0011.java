class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;

        // brute force
        // for(int i = 0; i <height.length ;i++ ){
        // for(int j = i+1;j<height.length ; j++){
        // int w = j-i;
        // int ht = Math.min(height[i],height[j]);
        // int currWater = w*ht;

        // maxWater = Math.max(maxWater,currWater);
        // }
        // }

        // return maxWater;

        // optimal 
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int w = right - left;
            int ht = Math.min(height[left], height[right]);
            int currWater = w * ht;

            maxWater = Math.max(maxWater, currWater);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}