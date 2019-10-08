class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        //check the two arrays if it is empty
        if(A.length == 0 && B.length == 0 && A == null && B == null){
            return -1;
        }
        
        int a = 0, b = 0; //counting the number of rotations for A and B
        
        //equal to A[0] can be in the first line or second line
        for(int i = 0; i < A.length; i++){
            if(A[i] != A[0] && B[i] != A[0]){
                break;
            }
            else{
                if(A[i] != A[0]){
                    a += 1;
                }
                else if(B[i] != A[0]){
                    b += 1;
                }
            }
            if(i == A.length - 1){
                return a > b ? b : a;
            }
        }
        
        a = 0;
        b = 0;
        
        //equal to B[0] can be in the first line or second line
        for(int j = 0; j < A.length; j++){
            if(A[j] != B[0] && B[j] != B[0]){
                break;
            }
            else{
                if(A[j] != B[0]){
                    a += 1;
                }
                else if(B[j] != B[0]){
                    b += 1;
                }
            }
            if(j == A.length - 1){
                return a > b ? b : a;
            }
        }
            
        return -1;
    }
}