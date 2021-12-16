class Solution {
    public boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        Depth(root);
        return flag;
    }
    public int Depth(TreeNode root){
        if (root ==null){
            return 0;
        }
        int left = Depth(root.left);
        int right = Depth(root.right);
        if (Math.abs(left-right)>1){
            flag=false;
        }
        return 1+Math.max(left,right);
    }
}