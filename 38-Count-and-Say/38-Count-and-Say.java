class Solution {
    public String countAndSay(int n) {
        /*
          1.     1
          2.     11
          3.     21   (one 2,  one 1 => 1211)
          4.     1211
          5.     111221
        */
        
        /*case for n = 1 or n <= 0*/
        if(n <= 0){
            return "";
        }
        
        if(n == 1){
            return "1";
        }
        
        String st = "1"; //define a string which is stored "1"
        
        int begin = 1; //start from 1
        
        while(begin < n){
            StringBuilder str = new StringBuilder();//string created
            
            int count = 1;//count for plus, plus the number of the last line 
            
            for(int i = 1; i < st.length(); i++){
                if(st.charAt(i) == st.charAt(i-1)){
                    count ++;
                }else{
                    str.append(count);
                    str.append(st.charAt(i-1));
                    count = 1;
                }
            }
            
            //if it didn't satisfy with the condition with for loop
            str.append(count);
            str.append(st.charAt(st.length() - 1));
            st =  str.toString();
            begin ++;
        }
        return st;
    }
}