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
    static int res = -1;
    public int calMax(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftMax = 0;
        int rightMax = 0;
        if(root.left != null){
            leftMax = calMax(root.left);
        }
        if(root.right != null){
            rightMax = calMax(root.right);            
        }
        res = Math.max(res,leftMax+rightMax+1);
        return Math.max(leftMax,rightMax)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        res = -1;
        int dp = calMax(root);
        return res-1;
    }
}