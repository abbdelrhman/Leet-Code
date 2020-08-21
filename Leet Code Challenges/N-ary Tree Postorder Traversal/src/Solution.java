import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root == null){
            return list;
        }else {
            for(Node n : root.children){
                postorder(n);
            }
            list.add(root.val);
        }
        return list;
    }

    
}