/* Structure of Doubly Linked List Node
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int idx, int x) {
        // code here
        Node a = new Node(x);
        Node temp = head;
        int i=0;
        while(i<idx && temp != null){
            temp = temp.next;
            i++;
        }
        Node b = temp.next;
        temp.next = a;
        a.next = b;
        a.prev = temp;
        if(b != null) b.prev = a;
        return head;
        
    }
}