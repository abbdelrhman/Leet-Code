import java.util.Collections;
import java.util.HashMap;
import java.util.*;

class Solution {
    //    public int countBalls(int lowLimit, int highLimit) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = lowLimit; i <= highLimit; i++) {
//            int box = sum(i);
//            if (map.containsKey(box)) {
//                map.replace(box, map.get(box) + 1);
//            } else {
//                map.put(box, 1);
//            }
//        }
//        int ans = Integer.MIN_VALUE;
//        Iterator Iterator = map.entrySet().iterator();
//        while (Iterator.hasNext()) {
//            Map.Entry mapElement = (Map.Entry) Iterator.next();
//            int val = (int) mapElement.getValue();
//            ans = Math.max(ans, val);
//        }
//        return ans;
//    }
    public int countBalls(int lowLimit, int highLimit) {
        int arr[] = new int[9 * 5 + 1];
        for (int i = lowLimit; i <= highLimit; i++) {
            int box = sum(i);
            arr[box]++;
        }
        int max=0;
        for (int i=0 ; i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public int sum(int number) {
        int ans = 0;
        while (number > 0) {
            ans += number % 10;
            number /= 10;
        }
        return ans;
    }
}