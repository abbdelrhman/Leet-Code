import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
            String ans="";
            preOrder(root,ans);
            return list;
    }
    public void preOrder(TreeNode root,String ans) {
        if (root != null) {
            ans+="->";
            ans+=root.val;
            if (root.left ==null && root.right==null){
                String s=ans.substring(2,ans.length());
                list.add(s);
            }
            preOrder(root.left,ans);
            preOrder(root.right,ans);
        }
    }

}