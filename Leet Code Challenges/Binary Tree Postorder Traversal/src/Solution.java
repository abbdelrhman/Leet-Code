import java.util.ArrayList;
import java.util.List;

class Solution {
    ArrayList<Integer> list ;
    public List<Integer> postorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        postOrder(root);
        return list;
    }
    public void postOrder(TreeNode root){
        if (root!=null){
            postOrder(root.left);
            postOrder(root.right);
            list.add(root.val);
        }
    }

}