import java.util.Stack;

class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0,l=0,r=0;
        if (s.charAt(0)=='L'){
            l++;
        }else {
            r++;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i)=='L'){
                l++;
                if (r==l){
                    ans++;
                    l=r=0;
                }
            }else{
                r++;
                if (r==l){
                    ans++;
                    l=r=0;
                }
            }
        }
        return ans;
    }
}