import java.util.Stack;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = ListToStack(l1);
        Stack<Integer> s2 = ListToStack(l2);
        int carry = 0;
        ListNode dummy = new ListNode(carry, null);
        int sum = 0;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            sum = carry;
            sum += s1.isEmpty() ? 0 : s1.pop();
            sum += s2.isEmpty() ? 0 : s2.pop();
            carry = sum >= 10 ? 1 : 0;
            sum = sum >= 10 ? sum % 10 : sum;

            dummy.val = sum;
            ListNode head = new ListNode(carry, dummy);
            dummy = head;
        }
        return dummy.val == 0 ? dummy.next : dummy;
    }

    public Stack ListToStack(ListNode list) {
        Stack<Integer> stack = new Stack<>();
        while (list != null) {
            stack.push(list.val);
            list = list.next;
        }
        return stack;
    }
}