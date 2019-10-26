class Solution {
    public int maxSubArray(int[] nums) {
        //  1. Either join the previous array plus (with a group of others)
        //  2. Either stand up an array yourself (single open one by yourself)

        int[] sums = new int[nums.length];
        
        sums[0] = nums[0];
        
        int max = nums[0]; //resume the max number = nums[0]
        
        for(int i = 1; i < nums.length; i++){
            sums[i] = Math.max(nums[i], sums[i-1] + nums[i]);
            max = Math.max(max, sums[i]);
        }
        
        return max;
    }
}