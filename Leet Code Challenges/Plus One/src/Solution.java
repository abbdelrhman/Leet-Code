class Solution {
    public static int[] plusOne(int[] digits) {
        int ans[];
        if (digits[0] == 9 && digits[digits.length - 1] == 9) {
            ans = new int[digits.length + 1];
            int reminder=1;
            for (int i = ans.length - 1; i > 0; i--) {
                int temp = (digits[i - 1] + reminder);
                ans[i] = temp % 10;
                reminder = temp/10;
            }
           ans[0]=reminder;
            if (reminder==0){
                int newAns[] = new int[ans.length-1];
                for (int i=0 ; i<newAns.length;i++){
                    newAns[i]=ans[i+1];
                }
                return newAns;
            }
        } else {
            ans = new int[digits.length];
            int temp = 0, reminder = 1;
            for (int i = digits.length - 1; i >= 0; i--) {
                temp = digits[i] + reminder;
                ans[i] = temp % 10;
                reminder = temp/10;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{1,2,3}));
    }
}