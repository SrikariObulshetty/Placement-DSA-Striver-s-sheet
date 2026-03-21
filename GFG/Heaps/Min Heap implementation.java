class minHeap {
     
    PriorityQueue<Integer>pq;
    // Constructor
    public minHeap() {
        // Initialize your data members.
        pq=new PriorityQueue<>();
    }

    public void push(int x) {
        // Insert x into the heap.
        pq.add(x);
    }

    public void pop() {
        // Remove the top (minimum) element.
        if(!pq.isEmpty()){
            pq.poll();
        }
    }

    public int peek() {
        // Return the top element or -1 if empty.
        if(!pq.isEmpty()){
            return pq.peek();
        }
        return -1;
        
    }

    public int size() {
        // Return the number of elements in the heap.
        return pq.size();
    }
}
TC:O(logN)
SC:O(N) 
