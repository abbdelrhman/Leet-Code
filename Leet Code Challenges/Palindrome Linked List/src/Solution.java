import java.util.ArrayList;

class Solution {
    public static boolean isPalindrome(ListNode head) {
        ListNode curr = head ;
        ArrayList<Integer> saved = new ArrayList<>();
        ListNode prev = null ,  next = null;
        while (curr!=null){
            saved.add(curr.val);
            next = curr.next;
            curr.next=prev;
            prev=curr;
            
            curr=next;
        }
        int i=0;
        while (prev!=null && i<saved.size()){
            if (saved.get(i) == prev.val){
                prev=prev.next;
                i++;

            }else{
               
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next= new ListNode(1);
        head.next.next= new ListNode(2);
        head.next.next.next= new ListNode(1);
        System.out.println(isPalindrome(head));
    }
}