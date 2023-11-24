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
   List<Integer> aList = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
     recursiveTree(root);
      return aList;
    }
    public void recursiveTree(TreeNode root){
        if(root==null){
            return ;
        }
        else{
           recursiveTree(root.left);
           aList.add(root.val);
           recursiveTree(root.right);
        }
    }
}