import java.util.Stack;

class Solution {
    public int calPoints(String[] ops) {
        int ans = 0 ;
        Stack<Integer> stack = new Stack<>();
        for (int i=0 ; i<ops.length;i++){
            if (ops[i].equals("C")){
                stack.pop();
            }else if (ops[i].equals("D")){
                int a = 2 * stack.peek();
                stack.push(a);
            }else if(ops[i].equals("+")){
                int temp2 = stack.pop();
                int temp1 = stack.pop();
                int a = temp1+temp2;
                stack.push(temp1);
                stack.push(temp2);
                stack.push(a);
            }else {
                stack.push(Integer.parseInt(ops[i]));
            }

        }
        while (!stack.isEmpty()){
            ans+=stack.pop();
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}