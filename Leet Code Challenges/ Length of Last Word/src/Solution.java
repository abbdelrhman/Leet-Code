class Solution {
    public static int lengthOfLastWord(String s) {
        String arr[] = s.split("\\s+");
        return arr[arr.length-1].length() ;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
}