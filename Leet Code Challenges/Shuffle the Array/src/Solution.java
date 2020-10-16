
public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans [] = new int[nums.length];
        for (int i=0 ; i< n ; i++){
            ans[2*i]=nums[i];
        }
        int j=1;
        for (int i=n ; i< nums.length ; i++){
            ans[j] = nums[i];
            j+=2;
        }
        return ans;
    }

}
