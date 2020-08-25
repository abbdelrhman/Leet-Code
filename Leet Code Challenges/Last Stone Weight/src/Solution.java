import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i=0 ; i<stones.length ; i++){
            maxHeap.add(stones[i]);
        }
        if(maxHeap.size() ==1 ){
            return maxHeap.remove();
        }else if(maxHeap.size() == 0){
            return 0;
        }
        else  {
            int s1 = maxHeap.remove();
            int s2 = maxHeap.remove();
            int remained ;
            if(s1 == s2){
                remained=0;
            }else {
                remained = s1-s2 ;
                maxHeap.add(remained);
            }
            stones = new int[maxHeap.size()];
            for(int i=0 ; i<stones.length ; i++){
                stones[i] = maxHeap.remove();
            }
            return lastStoneWeight(stones);
        }
        //now we have the stones as a max heap


    }
}

