class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        int size=0;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        int arr[] = new int[size];
        int i=0;
        boolean updated = false;
        while (temp!=null){
            ListNode temp2 = temp.next;
            while (temp2!=null){
                if (temp2.val > temp.val){
                    arr[i]=temp2.val;
                    i++;
                    updated =true;
                    break;
                }else {
                    temp2=temp2.next;

                }
            }
            if (!updated){
                i++;
            }
            updated=false;
            temp=temp.next;
        }
        return arr;
    }
}