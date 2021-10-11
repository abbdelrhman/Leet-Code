
class Solution {
    public int minOperations(String[] logs) {
        int ans = 0 ;
        for (int i=0 ; i<logs.length;i++){
            if (logs[i].charAt(0)!='.'){
                ans++;
            }else if (logs[i].charAt(1)=='.'){
                if (ans>0){
                    ans--;
                }
            }
        }
        return ans;
    }
}