import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    Queue<Integer> q = new LinkedList<>();

    public RecentCounter() {

    }

    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000) {
        q.remove();
        }
        return q.size();
    }
}