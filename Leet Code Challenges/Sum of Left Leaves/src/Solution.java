class Solution {
    static int sum = 0;

    public static int  sumOfLeftLeaves(TreeNode root) {
        preOrder(root);
        return sum;
    }

    public static void preOrder(TreeNode root) {
        if (root != null) {
            if (root.left != null) {
                if (root.left.left == null && root.left.right == null)
                    sum += root.left.val;
            }
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode nodeneg1 = new TreeNode(-1,null,new TreeNode(8));
        TreeNode node3 = new TreeNode(3,null,new TreeNode(6));
        TreeNode node4 = new TreeNode(4,node3,nodeneg1);
        TreeNode node1 = new TreeNode(1,new TreeNode(5),new TreeNode(1));
        TreeNode node2 = new TreeNode(2,node1,null);
        TreeNode root = new TreeNode(0,node2,node4);
        System.out.println(sumOfLeftLeaves(root));
    }
}