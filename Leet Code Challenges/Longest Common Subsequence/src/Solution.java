class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length() + 1;

        int m = text2.length() + 1;
        int ans[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            ans[i][0] = 0;
        }
        for (int i = 0; i < m; i++) {
            ans[0][i] = 0;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    ans[i][j] = 1 + ans[i - 1][j - 1];
                } else {
                    ans[i][j] = Math.max(Math.max(ans[i - 1][j - 1], ans[i][j - 1]), ans[i - 1][j]);
                }
            }
        }
        return ans[n - 1][m - 1];
    }
}