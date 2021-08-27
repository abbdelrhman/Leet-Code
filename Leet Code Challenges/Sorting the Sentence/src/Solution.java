class Solution {
    public static String sortSentence(String s) {
        String arr[] = s.split(" ");
        String ans [] = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int currentPosition = Integer.parseInt(String.valueOf(arr[i].charAt(arr[i].length()-1)));
            String temp = arr[i].substring(0,arr[i].length()-1);
            ans[currentPosition-1]=temp;
        }
        String sent="";
        for (int i=0 ; i<ans.length ; i++){
            sent+=ans[i];
            if (i != arr.length-1){
                sent+=" ";
            }
        }
        return sent;
    }

    
}