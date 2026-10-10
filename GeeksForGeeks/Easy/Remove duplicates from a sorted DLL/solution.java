/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // code here
        Node i=head;
        Node j = i.next;
        while(j != null){
            if(j.data == i.data){
                j = j.next;
            }
            else{
                i.next = j;
                j.prev = i;
                i =j;
                j = j.next;
            }
        }
        i.next =j;
        // j.prev =i;
        return head;
    }
}