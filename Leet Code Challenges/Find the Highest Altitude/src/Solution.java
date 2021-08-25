import java.util.Arrays;
import java.util.Collections;

class Solution {
    public static int largestAltitude(int[] gain) {
        int ans[] = new int [gain.length+1];
        ans[0] = 0;
        for (int i=1 ; i<ans.length ;i++){
            ans[i] = gain[i-1]+ans[i-1];
        }
        Arrays.sort(ans);
        return ans[ans.length-1];
    }

   
}