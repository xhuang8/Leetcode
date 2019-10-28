class Solution {
    public int mySqrt(int x) {
        
        if(x <= 1){
            return x;
        }
        
        //binary search start 1 to end x
        int start = 1;
        int end = x;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            if(mid == x/mid){ //do not use mid*mid == x, overflow occur
                return mid;
            }
            else{
                if(mid < x/mid){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return end;
    }
}