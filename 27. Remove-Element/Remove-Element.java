class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        for(int i = 0; i < length; i++){
            if(val == nums[i]){
                nums[i] = nums[length - 1];
                i--;
                length--;
            }
        }
        return length;
    }
}