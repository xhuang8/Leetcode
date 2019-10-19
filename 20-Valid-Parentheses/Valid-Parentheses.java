class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> hashMap = new HashMap<>();//Created Hashmap
        hashMap.put('(', ')');//added key-value
        hashMap.put('{', '}');
        hashMap.put('[', ']');
        
        //stack： last in first out
        Stack<Character> parentheses = new Stack<>();//created stack
        for(int i = 0; i < s.length(); i++){
            char p = s.charAt(i);
            //determine if there exists key or value
            if(hashMap.containsKey(p)){
                parentheses.push(hashMap.get(p));//get this element
            }else if(hashMap.containsValue(p)){
                if(parentheses.isEmpty() || parentheses.pop() != p){
                    return false;
                }
            }
        }
        return parentheses.isEmpty();
    }
}