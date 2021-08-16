class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[nums.length * 2];
        int j=0;
        for (int i=0 ; i<2*nums.length ; i++){
            ans[i]=nums[j++];
            if (i == nums.length-1){
                j=0;
            }
        }
        return ans;
    }
}