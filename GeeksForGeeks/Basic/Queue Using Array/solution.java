class myQueue {
    int[] arr;
    private int f;
    private int r;
    private int size;

    // Constructor
    public myQueue(int capacity) {
        // Define Data Structures
        arr = new int[capacity];
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return size==0;
    }

    public boolean isFull() {
        // Check if queue is full
        return size==arr.length;
    }

    public void enqueue(int val) {
        // Enqueue
        if(size==arr.length){
            return;
        }
        arr[r] = val;
        r++;
        if(r==arr.length) r=0;
        size++;
    }

    public void dequeue() {
        // Dequeue
        if(size==0){
            return;
        }
        f++;
        if(f==arr.length) f=0;
        size--;
    }

    public int getFront() {
        // Get front element
        if(size==0){
            return -1;
        }
        return arr[f];
    }

    public int getRear() {
        // Get last element
        if(size == 0){
            return -1;
        }

        int rearIndex = r - 1;

        if(rearIndex < 0)
            rearIndex = arr.length - 1;

        return arr[rearIndex];
    }
}
