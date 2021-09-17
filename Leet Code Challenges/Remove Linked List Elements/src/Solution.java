class Solution {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode prev = null;
        if (temp==null){
            return null;
        }
        if (temp.next == null){//node wa7da bs
            if (temp.val == val){
                return null;
            }else{
                return head;
            }
        }
        while (temp != null) {

            if (temp.val == val && temp.next != null) {

                temp.val = temp.next.val;
                temp.next = temp.next.next;

            }
            else if (temp.next == null ){//last node
                if (temp.val == val){
                    if (prev == null ){ // this the only node in the list
                        return null;
                    }else {
                        prev.next=null;
                        temp = null;
                    }
                }else{
                    return head;
                }
            }
            else {
                if (temp.next.next == null && temp.next.val == val) {
                    temp.next = null;
                }
                prev = temp;
                temp = temp.next;
            }
        }


        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(2);
//        head.next.next.next.next = new ListNode(1);
//        head.next.next.next.next.next = new ListNode(1);
        System.out.println(removeElements(head, 2));
    }
}