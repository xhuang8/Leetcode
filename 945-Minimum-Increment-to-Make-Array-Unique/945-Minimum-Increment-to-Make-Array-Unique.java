class Solution {
    public int minIncrementForUnique(int[] A) {
        if(A == null || A.length == 0){
            return 0;
        }
        
        Arrays.sort(A);
        int count = 0;
    for(int i=1; i<A.length; i++){
        if(A[i]<=A[i-1]){
            count+=A[i-1]+1-A[i];
            A[i]=A[i-1]+1;
        }
    }
 
    return count;
    }
}