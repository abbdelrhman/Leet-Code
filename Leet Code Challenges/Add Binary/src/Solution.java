class Solution {
    public static String addBinary(String a, String b) {
        String ans = "";
        int i = a.length() - 1, j = b.length() - 1;
        char rem = '0';
        while (i >= 0 && j >= 0) {
            if (a.charAt(i) == '1' && b.charAt(j) == '1') {
                if (rem == '0') {
                    ans += '0';

                } else {
                    ans += '1';
                }
                rem = '1';
            } else {
                if ((a.charAt(i) == '0' && b.charAt(j) == '1') || (a.charAt(i) == '1' && b.charAt(j) == '0')) {
                    if (rem == '0') {
                        ans += '1';
                    } else {
                        ans += '0';
                    }
                } else {
                    if (rem == '0') {
                        ans += '0';
                    } else {
                        ans += '1';
                    }
                    rem='0';
                }
            }
            j--;
            i--;
        }

        while (i >= 0) {
            if (a.charAt(i) == '1') {
                if (rem == '1') {
                    ans += '0';
                    rem = '1';
                } else {
                    ans += '1';
                }
            } else {
                if (rem == '1') {
                    ans += '1';
                } else {
                    ans += '0';
                }
                rem='0';
            }
            i--;
        }
        while (j >= 0) {
            if (b.charAt(j) == '1') {
                if (rem == '1') {
                    ans += '0';
                    rem = '1';
                } else {
                    ans += '1';
                }
            } else {
                if (rem == '1') {
                    ans += '1';
                } else {
                    ans += '0';
                }
                rem='0';
            }
            j--;
        }
        if (rem=='1'){
            ans+='1';
        }
        StringBuilder finaAns = new StringBuilder();

        // append a string into StringBuilder input1
        finaAns.append(ans);

        // reverse StringBuilder input1
        finaAns.reverse();

        // print reversed String
        return finaAns.toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary(  "101111", "10"));
    }


}