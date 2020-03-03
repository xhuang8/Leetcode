class Solution {
    public int slidingPuzzle(int[][] board) {
        Set<String> sets = new HashSet<>();
        String target = "123450";
        String toBoard = Arrays.deepToString(board).replaceAll("\\[|\\]|,|\\s","");
        
        Queue<String> queues = new LinkedList<>(Arrays.asList(toBoard));
        sets.add(toBoard);
        
        int count = 0;
        while(!queues.isEmpty()){
            for(int i = queues.size(); i > 0; i--){
                String str = queues.poll();
                if(str.equals(target)){
                    return count;
                }
                int j = str.indexOf('0');
                
                int[] displace = {1, -1, 3, -3};
                for(int k = 0; k < 4; k++){
                    int m = j + displace[k];
                    if(m < 0 || m > 5 || j == 2 && m == 3 || j == 3 && m == 2){
                        continue;
                    }
                    
                    char[] ch = str.toCharArray();
                    char tmp = ch[j];
                    ch[j] = ch[m];
                    ch[m] = tmp;
                    
                    toBoard = String.valueOf(ch);
                    if(sets.add(toBoard)){
                        queues.offer(toBoard);
                    }
                } 
            }
             ++count;
        }
        return -1;
    }
}