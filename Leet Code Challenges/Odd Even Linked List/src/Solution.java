class Solution {
    public static ListNode oddEvenList(ListNode head) {
        ListNode evenH=null,oddH=null,ePt=null,oPt=null;
        if (head!=null){
            oddH=head;
            oPt=head;
        }else{
            return head;
        }
        if (head.next!=null){
            evenH=head.next;
            ePt=head.next;
        }else {
            return head;
        }
        if (head.next.next==null){
            return head;
        }
        while (ePt != null ){
            if (ePt.next ==null){
                break;
            }
            oPt.next=oPt.next.next;
            ePt.next=ePt.next.next;
            oPt=oPt.next;
            ePt=ePt.next;
        }
        oPt.next=evenH;
        return head ;

    }

    public static void main(String[] args) {
        ListNode head =new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        System.out.println(oddEvenList(head));
    }
}