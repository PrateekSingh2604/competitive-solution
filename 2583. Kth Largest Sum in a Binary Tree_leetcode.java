/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> result = new ArrayList<>();
        bfs(root,result);
        if(result.size() < k){
            return -1;
        }
        Collections.sort(result, Collections.reverseOrder());
        return result.get(k-1);
    }

    public void bfs(TreeNode root, List<Long> result){
        Queue<TreeNode> q = new LinkedList<>();
        long e = 0;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node;
            for(int i=q.size(); i>0; i--){
                node = q.remove();
                if(node.left != null) q.add(node.left);
                if(node.right!=null)  q.add(node.right);
                e += (long)node.val;
            }
            result.add(e);

            e=0;

        }

    }
}
