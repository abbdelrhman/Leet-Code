import java.util.Stack;

class Solution {
    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        String ans ="";
        for (char c : s.toCharArray()){
            if (c=='('){
                stack.push('(');
                if (stack.size()>1){
                    ans+='(';
                }
            }else if (c == ')'){
                stack.pop();
                if (!stack.isEmpty()){
                    ans+=')';
                }
            }
        }
        return ans;
    }
    /*
    //without stack
    public String removeOuterParentheses(String S) {
        StringBuilder s = new StringBuilder();
        int opened = 0;
        for (char c : S.toCharArray()) {
            if (c == '(' && opened++ > 0) s.append(c);
            if (c == ')' && opened-- > 1) s.append(c);
        }
        return s.toString();
    }*/

    
}