import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        ListNode temp = head;
        int series = 0;
        int ans = 0;
        while (set.size() > 0 && temp!=null) {
            int val = temp.val;
            if (set.contains(val)) {
                series++;
                temp = temp.next;
                set.remove(val);
            } else {
                if (series!=0){
                    ans++;
                    series=0;
                }else {
                    temp=temp.next;
                }

            }
        }
        ans++;
        return ans;
    }

    public static void main(String[] args) {
        int nums[]={0,1,3};
        ListNode head = new ListNode(0);
        head.next=new ListNode(1);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(3);
        System.out.println(numComponents(head,nums));

    }
}