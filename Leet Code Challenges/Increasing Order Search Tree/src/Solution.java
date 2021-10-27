import java.util.ArrayList;

class Solution {
    public  TreeNode increasingBST(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        TreeNode curr = ans;
        ArrayList<Integer> vals=new ArrayList<>() ;
        inOrder(root,vals);
        for (int i=0 ; i<vals.size();i++){
            curr.right=new TreeNode(vals.get(i));
            curr = curr.right;
        }
        return ans.right;
    }

    public void inOrder(TreeNode root,ArrayList list) {

        if (root == null) {
            return ;
        } else {
            inOrder(root.left,list);
            list.add(root.val);
            inOrder(root.right,list);
        }
    }


}