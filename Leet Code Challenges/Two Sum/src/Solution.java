import java.util.HashMap;

class Solution {
    public static  int[] twoSum(int[] nums, int target) {
        int [] ans = new int [2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0 ; i<nums.length;i++){
            if (map.containsKey(target-nums[i])){
                //target found
                ans[0]=i;
                ans[1]=map.get(target - nums[i]);
            }
            map.put(nums[i],i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{1,2,3,4,9},12));
    }
}