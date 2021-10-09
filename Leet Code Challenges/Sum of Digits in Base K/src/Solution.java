import java.util.ArrayList;

class Solution {
    public int sumBase(int n, int k) {
        ArrayList<Integer> converted = new ArrayList<>();
        while (n!=0){
            converted.add(0,n%k);
            n/=k;
        }
        int ans=0;
        for (int i=0 ; i<converted.size();i++){
            ans+=converted.get(i);
        }
        return ans;
    }
}