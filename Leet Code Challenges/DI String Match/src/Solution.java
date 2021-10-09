class Solution {
    public int[] diStringMatch(String s) {
        int D = s.length();
        int I = 0;
        int ans[] = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                ans[i] = I;
                I++;
            } else {
                ans[i] = D;
                D--;
            }
        }
        ans[s.length()] = D;

        return ans;
    }
}