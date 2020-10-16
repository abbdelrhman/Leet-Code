import java.util.Arrays;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[] = new int[nums.length];
        int count = 0 ;
        int index = 0 ;
        for (int i= 0 ; i< nums.length ; i++){
            for (int j = 0 ; j < nums.length ; j++ ){
                if (nums[j] < nums[i] && j!=i){
                    count++;
                }
            }
            ans[index] = count;
            count=0;
            index++;
        }
        return ans;
    }


}
