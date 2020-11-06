/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf4);
 */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        int size = 0;
        
        char[] buf4 = new char[4];

        while(size < n){
           int reads = read4(buf4);
            
           if (reads == 0) break;
            
           for(int i = 0; i < reads && size < n;i++){
               buf[size] = buf4[i];
               size++;
           }
            
        }
        return size;
    }
}