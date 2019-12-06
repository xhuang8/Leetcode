class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        if(nums.length == 0 || k <= 0){
            return new int[nums.length];
        }
        
        int[] res = new int[nums.length - k + 1];
        LinkedList<Integer> MSW = new LinkedList<>();
        
        for(int i = 0; i < nums.length; i++){
            while(!MSW.isEmpty() && MSW.peekFirst() < i - k + 1){
                MSW.pollFirst();
            }
            
            while(!MSW.isEmpty() && nums[MSW.peekLast()] <= nums[i]){
                MSW.pollLast();
            }
            
            MSW.addLast(i);
            if(i - k + 1 >= 0){
                res[i - k + 1] = nums[MSW.peekFirst()];
            }
        }
        return res;
    }
}