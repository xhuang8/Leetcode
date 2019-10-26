class Solution {
    public int lengthOfLastWord(String s) {
        
        int i = s.length() - 1;
        
        while(i >= 0 && s.charAt(i) == ' ')
        {
            i--; //Find the first non-space character from right to left
        }
        
        if(i < 0)
        {
            return 0;
        }
        
        int count = 0;
        while(i >= 0 && s.charAt(i) != ' ')
        {
            count++;//count for the length of the last word.
            i--;
        }
        return count;
    }
}