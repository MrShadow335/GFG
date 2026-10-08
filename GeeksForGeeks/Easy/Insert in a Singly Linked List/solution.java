/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        this.data = x;
        this.next = null;
    }
} */
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // code here
        Node t = new Node(val);
        if(pos==1){
            t.next = head;
            head = t;
            return head;
        }
        Node temp = head;
        for(int i=1; i<pos-1; i++){
            temp=temp.next;
        }
        if(temp == null) return head;
        
        t.next = temp.next;
        temp.next = t;
        return head;
    }
    
}