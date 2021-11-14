import java.util.Stack;

class Solution {
    String ans = "";

    public String tree2str(TreeNode root) {
        preOrder(root);
        return ans;

    }

    public void preOrder(TreeNode root) {
        if (root != null) {
            ans += root.val;
            if (root.left != null || root.right!=null) {
                ans += "(";
                preOrder(root.left);
                ans += ")";
            }
            if (root.right != null) {
                ans += "(";
                preOrder(root.right);
                ans += ")";
            }

        }
    }
}

//"1(2(4()())())(3()())"
//"1(2(4))(3)"

//"1(2()(4()()))(3()())"
//"1(2()(4))(3)"