class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] arr = new ListNode[k];
        ListNode temp = head;
        int n = 0;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        temp = head;
        if (n <= k) {
            int i = 0;
            while (temp != null) {
                arr[i++] = new ListNode(temp.val);
                temp = temp.next;
            }
        } else {
            int i = 0;
            for (; i < n % k; i++) {
                ListNode dummy1 = new ListNode(temp.val);
                temp = temp.next;
                ListNode h1 = dummy1;
                for (int l = 1; l < (n / k) + 1; l++) {
                    dummy1.next = new ListNode(temp.val);
                    dummy1 = dummy1.next;
                    temp = temp.next;
                }
                arr[i] = h1;
            }
            int j = i+1;
            while (j < k) {
                ListNode dummy1 = new ListNode(temp.val);
                temp = temp.next;
                ListNode h1 = dummy1;
                for (int l = 1; l < (n / k) ; l++) {
                    dummy1.next = new ListNode(temp.val);
                    dummy1 = dummy1.next;
                    temp = temp.next;
                }
                arr[j++] = h1;
            }
        }
        return arr;
    }
}

//
//    int firstI = n/k + n%k;
//    ListNode dummy = new ListNode(temp.val);
//            temp=temp.next;
//                    ListNode h =dummy;
//                    for (int i=1 ; i<firstI ;i++){
//        dummy.next=new ListNode(temp.val);
//        dummy=dummy.next;
//        temp=temp.next;
//        }
//        arr[0]=h;
//        int otherI = n/k;
//        int j=1;
//        while (j<k){
//        ListNode dummy1 = new ListNode(temp.val);
//        temp=temp.next;
//        ListNode h1 =dummy1;
//        for (int i=1;i<otherI;i++){
//        dummy1.next=new ListNode(temp.val);
//        dummy1=dummy1.next;
//        temp=temp.next;
//        }
//        arr[j++]=h1;
//