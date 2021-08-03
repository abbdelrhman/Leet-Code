class Solution {
    public static void sort(String []s, int n)
    {
        for (int i=1 ;i<n; i++)
        {
            String temp = s[i];

            // Insert s[j] at its correct position
            int j = i - 1;
            while (j >= 0 && temp.length() < s[j].length())
            {
                s[j+1] = s[j];
                j--;
            }
            s[j+1] = temp;
        }
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1){
            return strs[0];
        }
        sort(strs,strs.length);
        String prefix ="";
        boolean added =false;
        int len = 0;

        for(int i=0 ; i<strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j=1 ; j<strs.length ;j++ ){
                if (c == strs[j].charAt(i)){
                    len++;
                    if (len == strs.length-1){
                        prefix+=c;
                        len=0;
                    }
                }else
                {
                    return prefix;

                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String s[] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }
}