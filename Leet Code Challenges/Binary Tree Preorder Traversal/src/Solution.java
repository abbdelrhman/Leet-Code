import java.util.ArrayList;
import java.util.List;

class Solution {
    ArrayList<Integer> list;

    public List<Integer> preorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        preOrder(root);
        return list;
    }
    public void preOrder(TreeNode root){
        if (root!=null){
            list.add(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}