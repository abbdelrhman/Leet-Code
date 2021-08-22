class Solution {
    public static int countConsistentStrings(String allowed, String[] words) {
        int ans=words.length;
        for (int i=0 ; i<words.length ; i++){
            for (int j=0 ; j<words[i].length();j++){

                if (!allowed.contains(words[i].substring(j,j+1))){
                    ans--;
                    break;
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String allowed = "fstqyienx";
        String words[] ={"lhoa","n","eeitfns","eqqqsfs","i","feniqis","yqyitei","sqtn","kug","z","neqqis"};
        System.out.println(countConsistentStrings(allowed,words));
    }
}