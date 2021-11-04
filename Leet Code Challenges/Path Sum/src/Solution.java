class Solution {
    boolean ans = false;
    public void preOrderTraversalSum(TreeNode root, int target , int no){
        if (root!=null){
            no +=  root.val;
            if (root.left==null && root.right==null){
                if (no == target){
                    ans=true;
                    return;
                }
            }
            preOrderTraversalSum(root.left,target,no);
            preOrderTraversalSum(root.right,target,no);
        }
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        preOrderTraversalSum(root,targetSum,0);
        return ans;
    }
}