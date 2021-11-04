class Solution {
    public static TreeNode invertTree(TreeNode root) {
        if(root == null ||(root.left == null && root.right==null) ){
            return root;
        }
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right=invertTree(temp);
        return root;
    }

    
}