class Solution {
    public int climbStairs(int n) {
        // n steps to reach the top
        // step[n] = setp[n - 1] + step[n - 2]
        if(n <= 2){
            return n;
        }
        
        int[] steps = new int[n + 1];
        steps[0] = 1;
        steps[1] = 2;
        for(int i = 2; i <= n; i++){
            steps[i] = steps[i - 1] + steps[i - 2];
        }
        return steps[n - 1];
    }
}