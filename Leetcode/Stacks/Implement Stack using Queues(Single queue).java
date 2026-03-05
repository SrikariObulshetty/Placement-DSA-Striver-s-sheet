class MyStack {
    Queue<Integer>q;

    public MyStack() {
        q=new LinkedList<>();
        
        
    }
    
    public void push(int x) {
       int size=q.size();
       q.add(x);
       while(size-->0){
         q.add(q.remove());
       }
        
    }
    
    public int pop() {
        if(!q.isEmpty()){
            return q.poll();
        }
        return -1;
    }
    
    public int top() {
        if(!q.isEmpty()){
            return q.peek();
        }
        return -1;
        
    }
    
    public boolean empty() {
        if(q.size()==0){
            return true;
        }
        return false;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
