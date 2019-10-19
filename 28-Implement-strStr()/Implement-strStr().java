class Solution {
    public int strStr(String haystack, String needle) {
        int a = haystack.length();
        int b = needle.length();
        
        if(a < b || haystack == null || needle == null){
            return -1;
        }
        
        if(b == 0){
            return 0;
        }
        
        int c = a - b;
        for(int i = 0; i <= c; i++){
            if(haystack.substring(i, i + b).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}