import java.util.ArrayList;

class Solution {
    ArrayList<Integer> list ;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        list=new ArrayList<>();
        preOrderTraversal(root1);
        ArrayList<Integer> list1 = list;
        list=new ArrayList<>();
        preOrderTraversal(root2);
        if (list1.size()!=list.size()){
            return false;
        }
        for (int i=0 ;i<list1.size();i++){
            if (!list1.get(i).equals(list.get(i))){
                return false;
            }
        }
        return true;
    }
    public void preOrderTraversal(TreeNode root){
        if (root!=null){
            if (root.left ==null && root.right ==null){
                list.add(root.val);
            }
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }


}