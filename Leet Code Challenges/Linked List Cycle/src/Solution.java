import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {
        List<ListNode> listNodes = new ArrayList<>();
        while (head !=null){
            if (listNodes.contains(head)){
                return true;
            }else {
                listNodes.add(head);

            }
            head=head.next;
        }
        return false;
    }
}
//    Set<ListNode> nodesSeen = new HashSet<>();
//        while (head != null) {
//                if (nodesSeen.contains(head)) {
//                return true;
//                } else {
//                nodesSeen.add(head);
//                }
//                head = head.next;
//                }
//                return false;