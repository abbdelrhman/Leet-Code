import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character,String > hashMap = new HashMap<>();
        HashSet<String >hashSet =new HashSet<>();
        String code[] ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-."
                ,"---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (int i=0 ; i<code.length;i++){
            hashMap.put((char) ('a'+i),code[i]);
        }
        for (int i=0 ; i<words.length;i++){
            String morse ="";
            for (int j=0 ; j<words[i].length();j++){
                morse+=hashMap.get(words[i].charAt(j));
            }
            hashSet.add(morse);
        }
        return hashSet.size();
    }
}
