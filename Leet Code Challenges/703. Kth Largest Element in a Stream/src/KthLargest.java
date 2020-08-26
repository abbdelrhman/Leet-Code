import java.util.PriorityQueue;
public class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i=0 ; i<nums.length ;i++){
            if(pq.size() <= k || pq.peek() < nums[i])
                pq.add(nums[i]);
            if(pq.size()>k)
                pq.poll();
        }
    }

    public int add(int val) {
        pq.add(val);
        if(pq.size()>k)
            pq.poll();
        return pq.peek();
    }
    public static void main(String[] args) {
        int arr [] ={4,5,8,2};
        KthLargest kthLargest = new KthLargest(3,arr );
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));

    }

}
