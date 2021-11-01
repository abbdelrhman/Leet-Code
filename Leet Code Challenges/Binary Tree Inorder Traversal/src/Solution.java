import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> ans = new ArrayList<>();
    public void Inorder (TreeNode root){
        if (root !=null){
            Inorder(root.left);
            ans.add(root.val);
            Inorder(root.right);
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        Inorder(root);
        return ans;
    }
}