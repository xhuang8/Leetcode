class Solution {
    public int removeDuplicates(int[] nums) {
        //check empty array
        if(nums.length == 0 || nums == null){
            return 0;
        }
        
        int  j = 0;//set the flag 
        for(int i = j + 1; i < nums.length; i++){
            //nums[0] == nums[1] increse i, then nums[0] != nums[2], increse j let nums[1] = nums[2], increse i,
            //nums[1] != nums[3], increse j let "nums[2] = nums[3]"-> replace the duplicates numbers
            if(nums[j] != nums[i]){
                nums[++j] = nums[i];//replace the duplicates numbers
            }
        }
        return j + 1;
    }
}