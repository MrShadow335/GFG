class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();
    public MyQueue() {
        
    }
    //push Efficient Approach 
    // public void push(int x) {//push effiicient approach
    //     st.push(x);
    // }
    
    // public int pop() {
    //     while(st.size() > 1){
    //         helper.push(st.pop());
    //     }
    //     int front = st.pop();
    //     while(helper.size()>0){
    //         st.push(helper.pop());
    //     }
    //     return front;
    // }
    
    // public int peek() {
    //     while(st.size() > 1){
    //         helper.push(st.pop());
    //     }
    //     int front = st.peek();
    //     while(helper.size()>0){
    //         st.push(helper.pop());
    //     }
    //     return front;
    // }

    //peek and pop efficient approach
    public void push(int val){
        while(st.size()>0){
            helper.push(st.pop());
        }
        st.push(val);
        while(helper.size()>0){
            st.push(helper.pop());
        }
    }
    public int pop(){
        return st.pop();
    }
    public int peek(){
        return st.peek();
    }
    
    public boolean empty() {
        if(st.size() == 0){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */