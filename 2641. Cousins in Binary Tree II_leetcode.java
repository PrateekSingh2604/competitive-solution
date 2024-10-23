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
    public TreeNode replaceValueInTree(TreeNode root) {
        bfs(root);
        return root;
    }

    public void bfs(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int levelSum = root.val;
        while(!q.isEmpty()){
            int nextLevelSum = 0;
            for(int i=q.size(); i>0; i--){
                TreeNode curr = q.remove();
                int siblingsSum = 0;
                curr.val = levelSum - curr.val;

                if(curr.left != null){
                    nextLevelSum += curr.left.val; 
                    q.add(curr.left);
                    siblingsSum += curr.left.val;
                    }
                if(curr.right != null) {
                    nextLevelSum += curr.right.val; 
                    q.add(curr.right);
                    siblingsSum += curr.right.val;
                    curr.right.val = siblingsSum;
                    }
                if(curr.left!= null){
                    curr.left.val = siblingsSum;
                }
                
            }
            levelSum = nextLevelSum;
        }
        return;
    }
}
