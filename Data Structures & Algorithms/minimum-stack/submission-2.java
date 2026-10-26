class MinStack {

    Stack<Integer> st;
    Stack<Integer> minSt = new Stack<>();

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(minSt.isEmpty() || val <= minSt.peek()){
            minSt.push(val);
        }
        st.push(val);
    }
    
    public void pop() {
        if (st.peek().equals(minSt.peek())) {
            minSt.pop();
        }
        if(!st.isEmpty())
            st.pop();
    }
    
    public int top() {
        int temp = 0;
        if(!st.empty()){
            temp = st.peek();
        }
        
        return temp;

    }
    
    public int getMin() {
        return minSt.peek();
    }
}
