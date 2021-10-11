import java.util.Stack;

class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        int size = s.length();
        for (int i = 0; i < size - 1; i++) {
            {

                if (stack.isEmpty()) {
                    stack.push(s.charAt(i));
                } else if (Math.abs(s.charAt(i) - stack.peek()) != 32) {
                    stack.push(s.charAt(i));
                } else {
                    stack.pop();
                }
            }
        }
        char ans[] = new char[stack.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            {
                ans[i] = stack.pop();
            }
        }
        return new String(ans);
    }
}