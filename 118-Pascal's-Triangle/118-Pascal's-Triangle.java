class Solution {
    public List<List<Integer>> generate(int numRows) {
       //The first and last digits of each line are 1
       //starting from the third line
       //each digit in the middle is the sum of the left and right digits of the previous line 
        
        List<List<Integer>> result = new ArrayList<>();
        
        if(numRows <= 0){
            return result;
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= numRows; i++){
            list.add(1);
            for(int j = list.size() - 2; j > 0; j--){
                list.set(j, list.get(j) + list.get(j - 1));
            }
            result.add(new ArrayList<>(list));
        }
        return result;
    }
}