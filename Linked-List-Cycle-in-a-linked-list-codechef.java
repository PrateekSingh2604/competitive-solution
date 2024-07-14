/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


class Solution {
    public static Node detectCycle(Node head){
        // Add code here
        HashSet<Node> s = new HashSet<>();
        Node curr = head;
        
        while(curr != null){
            if(s.contains(curr)){
                return curr;
            }
            s.add(curr);
            curr = curr.next;
        }
        return null;
    }
}
