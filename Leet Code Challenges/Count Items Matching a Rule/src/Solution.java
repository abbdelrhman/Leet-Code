import java.util.ArrayList;
import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int ans=0;
    for (int i=0 ; i<items.size() ; i++){
       switch (ruleKey){
           case "type":
               ans = items.get(i).get(0).equals(ruleValue)? ans+1 : ans ;
               break;
           case "color":
               ans = items.get(i).get(1).equals(ruleValue)? ans+1 : ans ;
               break;
           case "name":
               ans = items.get(i).get(2).equals(ruleValue) ? ans + 1 : ans;
               break;

       }
    }
    return ans;
    }

   
}