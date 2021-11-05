import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        return LevelOrderTraversal(root);
    }

    public List<Double> LevelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);//delimiter
        ArrayList<Double> ans = new ArrayList<>();
        ans.add((double) root.val);
        double avg = 0;
        int count = 0;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            if (temp == null) {
                if (!queue.isEmpty()){
                    ans.add(avg/count);
                    queue.add(null);
                    avg =count= 0;
                }
            } else {
                if (temp.left!=null){
                    count++;
                    queue.add(temp.left);
                    avg+=temp.left.val;
                }
                if (temp.right!=null){
                    count++;
                    queue.add(temp.right);
                    avg+=temp.right.val;
                }
            }
        }
        return ans;
    }
}