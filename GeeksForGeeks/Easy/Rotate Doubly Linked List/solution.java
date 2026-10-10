/* Structure of a doubly link list node
class Node {
    int data;
    Node prev, next;
    Node(int x) {
        data = x;
        prev = null;
        next = null;
    }
}*/

class Solution {
    public Node rotateDLL(Node head, int k) {
        // code here
        if(head==null || head.next == null) return head;
        Node temp = head;
        int len=0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        k%=len;
        if(k==0) return head;
        temp = head;
        for(int i =1; i<k; i++){
            temp = temp.next;
        }
        Node a = temp.next;
        a.prev = null;
        temp.next = null;
        Node b = a;
        while(b.next != null){
            b = b.next;
        }
        b.next = head;
        head.prev = b;
        head = a;
        return head;
        
    }
}