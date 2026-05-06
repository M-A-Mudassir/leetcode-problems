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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)return res;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        int n = 1;
        while(!que.isEmpty()){
            List<Integer> li = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode curr = que.remove();
                li.add(curr.val);
                if(curr.left != null){
                    que.add(curr.left);
                }
                if(curr.right != null){
                    que.add(curr.right);
                }
            }
            n = que.size();
            res.add(li);
        }
        return res;
    }
}