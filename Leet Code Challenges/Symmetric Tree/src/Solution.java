
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root==null || test(root.left,root.right);
    }
    public  boolean test(TreeNode left , TreeNode right){
        if (left == null || right ==null){
            return left==right;
        }
        if (left.val !=right.val){
            return false;
        }
        return test(left.left,right.right) && test(left.right,right.left);
    }
}