import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        boolean bool =true;
        int diff=0;
        if(arr.length >=2){
            diff=arr[1]-arr[0];
        }
        for (int i=0 ; i<arr.length-1 ;i++){
            if(arr[i+1]-arr[i] == diff){

            }else {
                bool = false;
                return false;
            }
        }
        return bool;
    }


}