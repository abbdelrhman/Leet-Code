import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack= new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<nums2.length;){
            if (!stack.isEmpty()){
                //4 <= 3
                if ( nums2[i]<= nums2[stack.peek()]){
                    stack.push(i);
                    i++;
                }else {
                    map.put(nums2[stack.pop()],nums2[i]);
                }

            }else {
                stack.push(i);
                i++;
            }
        }
        while (!stack.isEmpty()){
            map.put(nums2[stack.pop()],-1);
        }
        int ans [] =new int[nums1.length];
        for (int i=0 ; i<ans.length;i++){
            ans[i]= map.get(nums1[i]);
        }
        return ans;
    }
}
