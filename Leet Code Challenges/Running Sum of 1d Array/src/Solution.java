import java.util.Arrays;

class Solution {
    public int[] runningSum(int[] nums) {
        int ans [] = new int[nums.length];
        for (int i=0 ; i<ans.length ;i++){
            ans[i]=sumOfThePrevElem(nums,i);
        }
        return ans;
    }

    private int sumOfThePrevElem(int[] nums, int i) {
        int sum = 0 ;
        if(i==0){
            sum= nums[i];
        }else if(i>0){
            for(int j=0 ; j<=i ; j++){
                sum+=nums[j];
            }
        }
        return sum;
    }

}