class Solution {
    int tilt = 0 ;
    public int findTilt(TreeNode root) {
        dfs(root);
        return tilt;
    }
    public int dfs(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        tilt+= Math.abs(left-right);
        return left+right+root.val;
    }
}