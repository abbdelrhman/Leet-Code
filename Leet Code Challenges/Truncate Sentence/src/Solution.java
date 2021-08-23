class Solution {
    public static String truncateSentence(String s, int k) {
        char[] chars = s.toCharArray();
        int spaces = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == ' ') spaces++;
            if (spaces == k) return new String(chars, 0, i);
        }
        return s;
    }


}