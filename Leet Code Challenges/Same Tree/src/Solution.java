import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {


    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null){
            return true;
        }
        if (p==null && q!=null){
            return false;
        }
        if (q==null && p!=null){
            return false;
        }

        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.add(p);
        queue2.add(q);
        while (!queue1.isEmpty()){
            TreeNode t1 = queue1.remove();
            TreeNode t2 =queue2.remove();
            if (t1.val!=t2.val){
                return false;
            }
            if (t1.left!=null){
                queue1.add(t1.left);
                if (t2.left == null){
                    return false;
                }
            }
            if (t2.left !=null){
                queue2.add(t2.left);
                if (t1.left == null){
                    return false;
                }
            }
            if (t1.right!=null){
                queue1.add(t1.right);
                if (t2.right == null){
                    return false;
                }
            }
            if (t2.right !=null){
                queue2.add(t2.right);
                if (t1.right == null){
                    return false;
                }
            }
        }
        if (queue1.size()!=0 || queue2.size()!=0){
            return false;
        }

        return true;
    }
}