import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public int maximum69Number (int num) {
        ArrayList<Integer> arrayList =new ArrayList<>();
        while (num!=0){
            int temp = num%10;
            arrayList.add(0,temp);
            num/=10;
        }
        boolean falg = false;
        int ans=0;
        for (int i=0 ; i<arrayList.size();i++){
            if (arrayList.get(i) == 6 && !falg){
                falg=true;
                arrayList.set(i,9);
            }
            ans+=arrayList.get(i)*Math.pow(10,arrayList.size()-i-1);
        }
        return ans;
    }
}