class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();//created HashMap
        hashMap.put('I', 1);//added key-value
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        
        int sum = hashMap.get(s.charAt(0));
        for(int i = 0; i < s.length() - 1; i++)
        {
            if(hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i+1)))
            {
                sum += hashMap.get(s.charAt(i+1)) - 2 * hashMap.get(s.charAt(i));
                //Because the repetition process occurs during the traversal process, it is necessary to do the subtraction * 2
            }
            else
            {
                sum += hashMap.get(s.charAt(i+1));
            }
        }
        return sum;
    }
}