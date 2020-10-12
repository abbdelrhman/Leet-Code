import java.awt.image.Kernel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxElement = extractMax(candies);
        List<Boolean> ans = new ArrayList<>();
        for (int i=0 ; i<candies.length;i++){
            if(candies[i]+extraCandies >= maxElement){
                ans.add(true);
            }else {
                ans.add(false);
            }
        }
        return ans;
    }

    private int extractMax(int[] candies) {
        int max =candies[0];
        for (int i=1 ; i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        return max;
    }

   
}