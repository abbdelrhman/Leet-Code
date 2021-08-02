class Solution {
    public int reverse(int x) {
        String ans ="";
        boolean negative = false ;
        if (x<0){
            negative=true;
            x*=-1;
        }
        while (x!=0){
            int mod = x%10;
            ans+=mod;
            x/=10;
        }
        int finalAsn = 0;
        try {
            finalAsn = Integer.parseInt(ans);
            return negative? finalAsn*-1 : finalAsn;
        } catch (NumberFormatException e) {
            return 0 ;
        }

    }
}