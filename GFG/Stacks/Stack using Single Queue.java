class myStack {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        // Inserts an element x at the top of the stack
        int size=q.size();
        q.add(x);
        while(size-->0){
            q.add(q.remove());
        }
        
    }

    void pop() {
        // Removes an element from the top of the stack
        if(!q.isEmpty()){
            q.remove();
        }
    }

    int top() {
        // Returns the top element of the stack
        // If stack is empty, return -1
        if(!q.isEmpty()){
            return q.peek();
        }
        return -1;
    }

    int size() {
        // Returns the current size of the stack
        return q.size();
    }
}
