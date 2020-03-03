class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        
        int i = 0;
        int j = nums.length - 1;
        
        Map<Integer, Integer> map = new HashMap<>();
        while(i <= j){
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i])+1);
            else
				map.put(nums[i], 1);
			i++;
        }
        i = 0;
		while (i <= j) {
			if (map.get(nums[i]) == 1)
				break;
			i++;
		}
		return nums[i];
    }
}