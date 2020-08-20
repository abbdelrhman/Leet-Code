import java.util.ArrayList;
import java.util.regex.Pattern;

public class Solution {
    /***
     * You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
     * Given n, find the total number of full staircase rows that can be formed.
     * n is a non-negative integer and fits within the range of a 32-bit signed integer.
     *example
     *  n = 8
     *
     * The coins can form the following rows:
     * ¤
     * ¤ ¤
     * ¤ ¤ ¤
     * ¤ ¤
     *
     * Because the 4th row is incomplete, we return 3.
     * @param n the coins
     * @return number of full stairs
     */
    public static int arrangeCoins(int n) {
        int ans = 0;
        ArrayList <Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arrayList.add(i);
            n = n - i;
            if (n <= 0) {
                break;
            }
        }

        for (int i = 0; i < arrayList.size() ; i++) {
           if(arrayList.get(i) == (i+1) ) {
               ans++;
           }else {
               break;
           }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(1));
    }
}
