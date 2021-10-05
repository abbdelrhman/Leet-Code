import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer>  queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i=0 ; i< students.length ;i++){
            queue.add(students[i]);
            stack.push(sandwiches[sandwiches.length-i-1]);
        }
        int size=0;
        Boolean flag =false;
        while (true){
            if (queue.peek()==stack.peek()){
                queue.remove();
                stack.pop();
                size=0;
                flag=true;
            }else{
                flag=false;
                size++;
                int temp = queue.remove();
                queue.add(temp);
            }
            if (queue.isEmpty()){
                return 0;
            }
            if (!flag && size == queue.size()){
                return queue.size();
            }
        }
    }
}