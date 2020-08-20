class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalNumber = 0;
        int indexOfCapital = 10;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                indexOfCapital = i;
                capitalNumber++;
            }
        }
        if (capitalNumber == 0 || capitalNumber == word.length() || (capitalNumber == 1 && indexOfCapital == 0)) {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }


}