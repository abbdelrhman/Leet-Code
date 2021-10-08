import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left, n = 0; i <= right; i++) {
            for (n = i; n > 0; n /= 10)
                if (n % 10 == 0 || i % (n % 10) != 0) break;
            if (n == 0) res.add(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(100,105));
    }
}