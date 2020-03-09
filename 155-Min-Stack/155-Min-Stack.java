class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;
    
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty() || (!stack.isEmpty() && x <= minStack.peek())){//find the top element of the stack, but don't move it
            minStack.push(x);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        //pay attention the value which equals
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */