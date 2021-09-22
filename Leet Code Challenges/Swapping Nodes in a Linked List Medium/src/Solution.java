class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head, firstNode = null;
        int index = 1;
        int firstIndex = k;
        int size = 0;
        while (temp != null) {
            if (index == firstIndex) {
                firstNode = temp;
            }
            index++;
            size++;
            temp = temp.next;
        }
        temp = head;
        index = 1;
        int secondIndex = size - k + 1;

        while (temp != null) {

            if (index == secondIndex) {
                int i = temp.val;
                temp.val = firstNode.val;
                firstNode.val = i;
            }
            temp = temp.next;
            index++;

        }
        return head;
    }
}