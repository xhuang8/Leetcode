class Solution {
    public String addBinary(String a, String b) {
        
        //set the same length for two string
        int n = Math.max(a.length(), b.length());
        while(a.length() < n){
            a = '0' + a;
        }
        while(b.length() < n){
            b = '0' + b;
        }
        
        //add operation from low position to high position
        String res = "";
        int add = 0;
        for(int i = n - 1; i >= 0; i--){
            add = add + (a.charAt(i) - '0') + (b.charAt(i) - '0');//consider carry
            res = (char)('0' + add % 2) + res;
            add = add / 2;
        }
        //find if there is un-deal carry
        if(add > 0){
            res = '1' + res;
        }
        
        return res;
    }
}