/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode curr = root;
        List<Integer> aList = new ArrayList<>();
        while (curr != null) {
            TreeNode left = curr.left;
            if (left == null) {
                aList.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode successor = getSuccessor(left, curr);
                if (successor.right == null) {
                    successor.right = curr;
                    curr = curr.left;
                } else {
                    successor.right = null;
                    aList.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return aList;

    }

    public TreeNode getSuccessor(TreeNode left, TreeNode curr) {
        TreeNode succ = left;
        while (succ.right != null && succ.right != curr) {
            succ = succ.right;
        }
        return succ;
    }
}