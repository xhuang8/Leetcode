class Solution {
    public boolean isHappy(int n) {
        if(n < 1){
            return false;
        }
        
        HashSet<Integer> sets = new HashSet<>();
        int t;
        
        while(n != 1){
            if(sets.contains(n)){
                break;
            }
            
            int sum = 0;
            sets.add(n);
            while(n > 0){
                t = n % 10;
                sum += t * t;
                n /= 10;
            }
            n = sum;
        }
        if(n == 1){
            return true;
        }
        return false;
    }
}