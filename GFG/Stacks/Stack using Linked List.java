// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
    Node head;
    int size;

    public myStack() {
        // Initialize your data members.
        size=0;
    }

    public boolean isEmpty() {
        // check if the stack is empty.
        if(head==null){
            return true;
        }
        return false;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        Node node = new Node(x);
        if(head==null){ // we are adding the first element.
            head=node;
        }
        else{
            node.next=head;
            head=node;
        }
        size++;   
    }

    public void pop() {
        // Removes the front element of the stack.
        if(head!=null){
            head=head.next;
            size--;
        }
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(head!=null){
            return head.data;
        }
        return -1;
    }

    public int size() {
        // Returns the current size of the stack.
        return size;
    }
}
