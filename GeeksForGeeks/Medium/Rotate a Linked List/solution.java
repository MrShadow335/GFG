/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public int length(Node head){
        Node temp = head;
        int len =0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        return len;
    }
    public Node rotate(Node head, int k) {
        // code here
        if(head.next == null) return head;
        int n = length(head);
        k=k%n;
        if(k==0) return head;
        Node slow = head;
        Node fast = head;
        for(int i=1; i<=n-k+1; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        Node a = slow.next;
        slow.next = null;
        Node b = a;
        while(b.next != null){
            b = b.next;
        }
        b.next = head;
        return a;
    }
}