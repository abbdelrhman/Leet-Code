class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

            ListNode pt1 = list1;
            int i=0,j=0 ;
            while (i<a-1){
                pt1=pt1.next;
                i++;
            }
            ListNode pt2 = list1;
            i=0;
            while (i<=b){
                pt2=pt2.next;
                i++;
            }
            pt1.next =list2;
            while (list2.next!=null){
                list2=list2.next;
            }
            list2.next=pt2;
            return list1;
    }
}