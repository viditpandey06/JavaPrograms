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
    public void recoverTree(TreeNode root) {
       List<TreeNode>aList1=new ArrayList<>();
       aList1=inorderTraversal(root); 
    
    TreeNode x=null,y=null;
    for(int i=0;i<aList1.size()-1;i++){
        if((aList1.get(i).val)>(aList1.get(i+1).val)){
           System.out.println("hello");
            if(x==null){
                x=aList1.get(i);
            }
            else if(x!=null&&y==null){
                y=aList1.get(i+1);
            }
        }
        else{
            continue;
        }

      }
        
    int temp=x.val;
    x.val=y.val;
    y.val=x.val;
}
    public List<TreeNode> inorderTraversal(TreeNode root){
        List<TreeNode>aList=new ArrayList<>();
        if(root==null){
            return aList;
        }
        else{
            inorderTraversal(root.left);
            aList.add(root);
            inorderTraversal(root.right);
        }
        return aList;
    }
}