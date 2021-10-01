class Solution {
    public String toLowerCase(String str) {
        char[] chArray = str.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] >= 'A' && chArray[i] <= 'Z') {
                chArray[i] += 32;
            }
        }
        return String.valueOf(chArray);
    }
}