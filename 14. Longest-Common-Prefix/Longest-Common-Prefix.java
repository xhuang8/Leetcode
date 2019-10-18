class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null){
            return "";
        }
        String res = new String();
        for(int i = 0; i < strs[0].length(); i++){
            char n = strs[0].charAt(i);//check the fisrt index of the string

            /*Each time we take out a word at a certain position of the first string, and then traverse the corresponding positions of all other strings to see if they are equal. If there is any unsatisfied return directly to res, if they are all the same, then the current character is stored in the result. Continue to check the characters in the next position*/

            for(int j = 1; j < strs.length; j++){
                if(strs[j].length() <= i || strs[j].charAt(i) != n)
                {
                    return res;
                }
            }
            res += Character.toString(n);
        }
        return res;
    }
}