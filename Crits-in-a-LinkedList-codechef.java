// Node is defined as:
// class Node{
//     int val;
//     Node next;
//     Node(int x){
//     	val = x; next = null;
//     }
// }
class Solution{
    static int solve(Node root){
        int result = 0;
        Node curr = root;
        
        if(root == null || root.next == null){
            return 0;
        }
        
        while(curr.next.next != null){
            if((curr.val > curr.next.val && curr.next.val < curr.next.next.val) || (curr.val < curr.next.val && curr.next.val > curr.next.next.val)){
                result++;
            }
            curr = curr.next;
        }
        return result;
    }
}
