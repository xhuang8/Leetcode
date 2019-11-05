class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        //the one sorted array set its length as k
        int k = m + n - 1;
        
        //i for nums1, j for nums2
        //for the back to front using while loop
        int i = m - 1;
        int j = n - 1;
        
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                //finish the nums1
                nums1[k] = nums1[i];
                i--;
               
            }else{
                nums1[k] = nums2[j];
                j--;
               
            }
            k--;
        }    
            
        //the rest number after finish nums1
        while(i >= 0){
            nums1[k] = nums1[i];
            i--;
            k--;
        } 
        
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    
    }
}