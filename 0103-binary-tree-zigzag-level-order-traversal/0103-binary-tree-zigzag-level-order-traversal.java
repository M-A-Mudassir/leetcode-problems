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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> que = new LinkedList<>();
        int n = 1;
        que.add(root);
        int k =1;
        while(!que.isEmpty()){
            List<Integer> li = new ArrayList<>();
            for(int i=1;i<=n;i++){
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
            if(k % 2 != 0){
                res.add(li);
            }else{
                Collections.reverse(li);
                res.add(li);
            }
            k++;
        }
        return res;
    }
}