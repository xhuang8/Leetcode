class Solution {
    public int findPairs(int[] nums, int k) {
        
        int output = 0;
        if(k < 0){
            return output;
        }
        
        HashMap<Integer, Integer> FP = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            FP.put(nums[i], i); //added key-value;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(FP.containsKey(nums[i] + k) && FP.get(nums[i] + k) != i){
                output ++;
                FP.remove(nums[i] + k);
            }
        }
        return output;
    }
}