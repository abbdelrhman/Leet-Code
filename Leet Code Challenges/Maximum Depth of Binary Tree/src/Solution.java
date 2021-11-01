class Solution {
    int level = 1;

    public void InOrder(TreeNode root, int l) {

        if (root != null) {
            if ((root.left == null && root.right == null)) {
                level = Math.max(level,l);
            }
            l += 1;
            InOrder(root.left, l);
            InOrder(root.right, l);
        }
    }

    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        InOrder(root, 1);
        return level;
    }



}