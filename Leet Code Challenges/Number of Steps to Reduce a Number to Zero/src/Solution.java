class Solution {
    public int numberOfSteps(int num) {
        int index = 0;
        if (num % 2 != 0) {
            num--;
            index++;
        }
        while (num != 0) {
            num /= 2;
            index++;
            if (num % 2 != 0) {
                num--;
                index++;
            }
        }
        return index;
    }
}