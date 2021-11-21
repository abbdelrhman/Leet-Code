import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        TreeNode parentX = null, parentY = null;
        boolean flagX = false, flagY = false;
        int depthX = 0, depthY = 0, depth = 0;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            if (temp == null) {
                if (flagX  || flagY){
                    if (!flagX || !flagY){
                        return false;
                    }
                    if (parentX!=parentY){
                        return true;
                    }else {
                        return false;
                    }
                }
                if (queue.isEmpty()) {
                    break;
                }
                queue.add(temp);
                continue;
            }
            if (temp.left != null) {
                queue.add(temp.left);
                if (temp.left.val == x || temp.left.val == y){
                    parentX = temp.left.val == x ? temp : parentX;
                    parentY = temp.left.val == y ? temp : parentY;
                    flagX = temp.left.val == x ? true : flagX;
                    flagY = temp.left.val==y?true:flagY;
                }
            }
            if (temp.right != null) {
                queue.add(temp.right);
                if (temp.right.val == x || temp.right.val == y){
                    parentX = temp.right.val == x ? temp : parentX;
                    parentY = temp.right.val == y ? temp : parentY;
                    flagX = temp.right.val == x ? true : flagX;
                    flagY = temp.right.val==y?true:flagY;
                }
            }
        }
        return false;
    }

}