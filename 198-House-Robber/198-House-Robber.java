class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        
        //assume that we are in the room of number i
        //for this room, we have two choice
        //first one, we select to rob this room, then the max-money = the number i-2 + this room
        //second, we select not to rob, the the max money = the number i-1
        //money[i] = Math.max(money[i-1], money[i-2] + room[i-1]); i strats with 1
        //money[1] = room[0];
        
        int[] maxMoney = new int[nums.length + 1];
        maxMoney[1] = nums[0];
        
        for(int i = 2; i <= nums.length; i++){
            maxMoney[i] = Math.max(maxMoney[i-1], maxMoney[i-2] + nums[i-1]);
        }
        
        return maxMoney[nums.length];  
    }
}