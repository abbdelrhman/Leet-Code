class Solution {
    public static int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (int i = 0; i < operations.length; i++) {
            char c=  operations[i].charAt(1);
            if (c=='+') {
                ans++;
            } else {
                ans--;
            }
        }
        return ans;
    }

  
}