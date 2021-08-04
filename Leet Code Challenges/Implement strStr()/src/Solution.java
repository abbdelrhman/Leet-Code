class Solution {
    public static  int strStr(String haystack, String needle) {
        if (haystack.length() == 0 && needle.length() ==0){
            return 0;
        }
        int ans =-1 ;
        for (int i=0 ; i<=haystack.length()-needle.length();i++){
            if (haystack.substring(i, i+needle.length()).equals(needle)){
                ans=i;
                break;
            }
        }
        return ans;
    }

}