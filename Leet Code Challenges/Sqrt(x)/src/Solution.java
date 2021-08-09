class Solution {
    public static int mySqrt(int x) {
        long i=1;
        while (i*i<(long)x){
            i++;
        }
        if (i*i>x){
            i--;
        }
        return (int)i;
    }

 
}