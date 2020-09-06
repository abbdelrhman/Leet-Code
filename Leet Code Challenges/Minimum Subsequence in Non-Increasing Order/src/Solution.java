import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        ans.add(nums[nums.length-1]);
        int i=0 ;
        while (sum(nums,nums.length-i-1) >= sum(ans)){
            i++;
            ans.add(nums[nums.length-i-1]);
        }
        return ans;
    }
    public int sum(int arr[] , int end){
        int sum =0;
        for(int i=0 ; i<end ; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public int sum(List<Integer> arr ){
        int sum =0;
        for(int i=0 ; i<arr.size() ; i++){
            sum+=arr.get(i);
        }
        return sum;
    }

   
}