class Solution {
    public int reverse(int x) {
        long rev = 0;//overflow case
        long t = 0;
        while(x != 0){
            t = rev * 10 + x % 10;
            rev = t;
            x = x / 10;
            t = x;
        }
        return (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) ? 0 : (int)rev;
    }
}