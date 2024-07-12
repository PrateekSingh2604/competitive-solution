/* Linked List Node
struct Node {
    int data;
    struct Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}; */

class Solution {
    Node removeDuplicates(Node head) {
        // your code here
         if(head == null || head.next == null){
            return head;
        }
        Node prev = head;
        Node curr = head.next;
        while(prev!=null){
            while(curr!=null && curr.data==prev.data){
                curr = curr.next;
            }
            prev.next = curr;
            prev = prev.next;
            if(prev!=null)
                curr = prev.next;
        }
        return head;    
    }
};
