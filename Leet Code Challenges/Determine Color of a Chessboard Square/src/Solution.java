class Solution {
    public static boolean squareIsWhite(String a) {
        boolean te = (int)a.charAt(0) % 2 != (int)a.charAt(1) % 2;
        return te;
    }

    public static void main(String[] args) {
        String a = "a1";
        int x = (int)a.charAt(0) ;
        x = x% 2;
        int y =(int) a.charAt(1);
        y=y%2;
    }
}