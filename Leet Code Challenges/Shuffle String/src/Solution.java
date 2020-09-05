public class Solution {
    public String restoreString(String s, int[] indices) {
        char ans [] = s.toCharArray();
        for(int i=0 ; i<indices.length-1;i++){
            int minIndex = i ;
            for (int j=i+1 ; j<indices.length ; j++){
                if(indices[j]< indices[minIndex]){
                    minIndex=j;
                }
            }
            System.out.println(minIndex);
            char temp = ans[i];
            ans[i] = ans[minIndex];
            ans[minIndex]=temp;
            swap(i,minIndex,indices);
        }
        return new String(ans);
    }
    public void swap(int i , int j , int arr[]){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
