import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//better solution
//class MyHashSet {
//    private final int MAX_SIZE = 1000000;
//    private final int BUCKET_SIZE =100;
//    List<List<Integer>> Bucket ;
//    /**
//     * Initialize your data structure here.
//     */
//    public MyHashSet() {
//        Bucket = new ArrayList<>(BUCKET_SIZE);
//        for (int i=0 ; i<BUCKET_SIZE ;i++){
//           Bucket.add(null);
//        }
//
//    }
//
//    public void add(int key) {
//      int index = key % BUCKET_SIZE ;
//      List<Integer> child = Bucket.get(index);
//      if (child==null){
//        List<Integer> list = new LinkedList<>();
//        list.add(key);
//        Bucket.add(index,list);
//      }else{
//          if (!child.contains(key)){
//              child.add(key);
//          }
//      }
//    }
//
//    public void remove(int key) {
//        int index = key % BUCKET_SIZE ;
//        List<Integer> child = Bucket.get(index);
//        if (child==null){
//
//        }else{
//            if (child.contains(key)){
//                Bucket.get(index).remove(child.indexOf(key));
//            }
//        }
//
//    }
//
//    /**
//     * Returns true if this set contains the specified element
//     */
//    public boolean contains(int key) {
//        int index = key % BUCKET_SIZE ;
//        List<Integer> child = Bucket.get(index);
//
//        return child!=null && child.contains(key);
//    }
//}

// naive solution
//class MyHashSet {
//    LinkedList<Integer> hash;
//
//    /**
//     * Initialize your data structure here.
//     */
//    public MyHashSet() {
//        hash = new LinkedList<>();
//    }
//
//    public void add(int key) {
//        if (!hash.contains(key)) {
//            hash.add(key);
//        }
//    }
//
//    public void remove(int key) {
//        if (hash.contains(key)) {
//            hash.remove(hash.indexOf(key));
//        }
//    }
//
//    /**
//     * Returns true if this set contains the specified element
//     */
//    public boolean contains(int key) {
//        return hash.contains(key);
//    }
//}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */