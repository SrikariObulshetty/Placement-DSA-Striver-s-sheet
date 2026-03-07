// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    Node head;
    int size;
    Node last;
    public myQueue() {
        // Initialize your data members.
        head=null;
        size=0;
        last=null;
    }

    public boolean isEmpty() {
        // check if the queue is empty.
        if(head==null){
            return true;
        }
        return false;
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        Node node=new Node(x);
        size++;
        if(head==null){ //first element we are gng to insert.
            head=node;
            last=node;
        }
        else{
            last.next=node;
            last=node;
        }
    }

    public void dequeue() {
        // Removes the front element of the queue.
        if(head!=null){
            head=head.next;
            size--;
        }
        
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        if(head!=null){
             return head.data;
        }
        return -1;
       
    }

    public int size() {
        // Returns the current size of the queue.
        return size;
        
    }
}
