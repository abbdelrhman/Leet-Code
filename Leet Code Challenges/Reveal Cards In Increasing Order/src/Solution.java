import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> queue = new LinkedList<>();
        Arrays.sort(deck);
        int size = deck.length;
        for (int i=0 ; i<size;i++){
            queue.add(i);
        }
        int ans[] = new int[size];
        for (int i=0 ; i<size;i++){
            ans[queue.remove()]=deck[i];
            if (!queue.isEmpty()){
                queue.add(queue.remove());
            }
        }
        return ans;
    }
}