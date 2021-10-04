import java.util.Stack;

class Solution {
    public static int maxDepth(String s) {
        if (s.isEmpty() || s.length()==1){
            return 0;
        }

        int max = -1, count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {

                count++;
                if (count > max) {
                    max = count;
                }
            }else if (s.charAt(i) == ')') {

                count--;
                if (count > max) {
                    max = count;
                }
            }
        }
        return max>-1 ? max: count;
    }

    public static void main(String[] args) {
        System.out.println(maxDepth("1+(2*3)/(2-1)"));
    }
}