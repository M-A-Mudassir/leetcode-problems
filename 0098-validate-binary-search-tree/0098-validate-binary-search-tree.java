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
    public boolean isBst(long lower,TreeNode root,long high){
        if(root == null)return true;
        if(root.val <= lower || root.val >= high){
            return false;
        }
        return (isBst(lower,root.left,root.val) && isBst(root.val,root.right,high));
    }
    public boolean isValidBST(TreeNode root) {
        return isBst(Long.MIN_VALUE,root,Long.MAX_VALUE);
    }
}