import java.util.ArrayList;

public class Solution {
    public int getDecimalValue(ListNode head) {
        int ans =0;
        int j=0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (head!=null){
            arrayList.add(head.val);
            head=head.next;
        }
        for(int i=arrayList.size()-1;i>=0 ; i--){

           ans+= Math.pow(2,j)*arrayList.get(i);
           j++;
        }
        return ans;
    }
}
