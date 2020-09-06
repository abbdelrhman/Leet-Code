import java.util.Arrays;
import java.util.SplittableRandom;

public class Solution {

    public String sortString(String s) {
        s.toLowerCase();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String ans = "";
        int i = 0;
        ans += arr[i];
        int size = 0;
        while (true) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] == arr[j - 1]) {

                } else {
                    arr[i] = '&';
                    if (arr[j] != '&') {
                        ans += arr[j];
                        i = j;
                    }
                }
            }
            arr[i] = '&';
            for (int j = arr.length-1; j >= 1; j--) {

                if (arr[j] == arr[j - 1]) {

                } else {
                    if(arr[j]!='&')
                    {
                        ans += arr[j];
                        i = j;
                        arr[i] = '&';
                    }
                }
            }
            if (ans.length() >= arr.length) {
                break;
            }
        }
        return ans;
    }

  
}