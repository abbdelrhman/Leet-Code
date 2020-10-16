
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode ans = head;
        int middle = indexOfMiddle(head);
        int i=0;
        while (i<middle){
            i++;
            ans=ans.next;
        }
        return ans;
    }
    public int indexOfMiddle (ListNode head){
        int count =0;
        while (head!=null){
            head=head.next;
            count++;
        }
        System.out.println(count);
        return count/2;
    }


}