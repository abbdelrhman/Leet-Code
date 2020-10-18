import java.util.Arrays;

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int totalAns = 0;
        for (int i = 0; i < arr.length; i++) {
            totalAns += arr[i];
        }
        int subLength = 3;
        int size = arr.length;
        int tempAns = 0;
        while (subLength <= size) {
            for (int i = 0; i <= arr.length - subLength; i++) {
                for (int j = i; j < i + subLength; j++) {
                    tempAns += arr[j];
                }
                totalAns += tempAns;
                tempAns = 0;
            }
            subLength += 2;
        }
        return totalAns;
    }


}