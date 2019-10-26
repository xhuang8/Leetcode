class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            //if the last digits equal to 9, so the last one equal to 0
            digits[i] = 0;
        }
        
        //if the first digit is equal to 9, then should extend array let the first one equal to 1
        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        return newArr;
    }
}