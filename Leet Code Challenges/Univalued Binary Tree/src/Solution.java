class Solution {
    boolean ans = true;
    public boolean isUnivalTree(TreeNode root) {
        int value = root.val;
        preOrderTraversal(root,value);
        return ans;
    }
    public void preOrderTraversal(TreeNode root, int value){
        if (root!=null){
            if (root.val != value){
                ans = false;
                return;
            }
            preOrderTraversal(root.left,value);
            preOrderTraversal(root.right,value);
        }
    }
}