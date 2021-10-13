import java.util.Stack;

class Solution {
   /* public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        for (int i=0 ; i<s.length();i++){
            if (s.charAt(i)!='#'){
                stackS.push(s.charAt(i));
            }else {
                if (!stackS.isEmpty()){
                    stackS.pop();
                }
            }

        }
        for (int i=0 ; i<t.length();i++){
            if (t.charAt(i)!='#'){
                stackT.push(t.charAt(i));
            }else {
                if (!stackT.isEmpty()){
                    stackT.pop();
                }
            }
        }
        if (stackS.size() != stackT.size()){
            return false;
        }else {
            while (!stackS.isEmpty()){
                char a = stackS.pop(),b=stackT.pop();
                if (a!=b){
                    return false;
                }else {
                    continue;
                }
            }
        }
        return true;
    }*/
    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1,j=t.length()-1,remove=0;
        while (true){
            remove=0;
            while (i>=0 && (remove>0 || s.charAt(i)=='#') ){
                remove += s.charAt(i)=='#' ? 1 : -1 ;
                i--;
            }
            remove=0;
            while (j>=0 && (remove>0 || t.charAt(j)=='#')){
                remove += t.charAt(j)=='#' ? 1 : -1 ;
                j--;
            }
            if (i>=0 && j>=0 && s.charAt(i)==t.charAt(j)){
                i--;
                j--;
            }else {
                break;
            }
        }
        return i==-1 && j==-1;
    }
}