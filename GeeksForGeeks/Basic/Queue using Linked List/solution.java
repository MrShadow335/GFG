// Node class
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

// Queue class
class myQueue {
    Node head;
    Node tail;
    int size;
    
    public myQueue() {
        // Initialize your data members
        head = null;
        tail = null;
        size =0;
    }

    public boolean isEmpty() {
        // check if the queue is empty
        return (size==0);
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        Node temp = new Node(x);
        if(size==0) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public void dequeue() {
        // Removes the front element of the queue
        if(size==0){
            return;
        }
        head = head.next;
        size--;
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        if(size==0){
            return -1;
        }
        return head.data;
    }

    public int size() {
        // Returns the current size of the queue.
        return size;
    }
}
