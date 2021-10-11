import javax.swing.text.MutableAttributeSet;
import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public static int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE , max2=max1;
        int largestI = -1;
        for (int i=0 ; i<nums.length;i++){
            if (nums[i] > max1){
                largestI=i;
                max1=nums[i];
            }
        }
        for (int i=0 ; i<nums.length; i++){
            if (nums[i] > max2 && i!=largestI){
                max2=nums[i];
            }
        }
        return (max1-1) * (max2-1) ;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[] {1,5,4,5}));
    }
}