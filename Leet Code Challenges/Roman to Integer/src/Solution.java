import java.util.HashMap;

class Solution {
    public static boolean subtraction(String s, int i, int j) {
        if (s.charAt(i) == 'I' && s.charAt(j) == 'V') {
            return true;
        }
        if (s.charAt(i) == 'I' && s.charAt(j) == 'X') {
            return true;
        }
        if (s.charAt(i) == 'X' && s.charAt(j) == 'L') {
            return true;
        }
        if (s.charAt(i) == 'X' && s.charAt(j) == 'C') {
            return true;
        }
        if (s.charAt(i) == 'C' && s.charAt(j) == 'D') {
            return true;
        }
        if (s.charAt(i) == 'C' && s.charAt(j) == 'M') {
            return true;
        }
        return false;
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> dictionary = new HashMap<>();
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);

        int result = 0;
        int i=0 ;
        for (; i < s.length() - 1; i++) {
            if (subtraction(s,i,i+1)) {
                result += dictionary.get(s.charAt(i + 1)) - dictionary.get(s.charAt(i));
                i++;
            } else {
                result += dictionary.get(s.charAt(i));
            }
        }
        if (i<s.length()){
            result+=dictionary.get(s.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "CMLII";
        System.out.println(romanToInt(s));
    }
}