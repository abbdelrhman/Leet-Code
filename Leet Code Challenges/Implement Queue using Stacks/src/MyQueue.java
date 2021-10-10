import java.util.Stack;

class MyQueue {
    private Stack<Integer> pushStack = new Stack<>();
    private Stack<Integer> popStack = new Stack<>();
    int top = 0;

    public MyQueue() {

    }

    public void push(int x) {
        if (pushStack.isEmpty() && popStack.isEmpty()) {
            top = x;
        } else if (pushStack.isEmpty() && !popStack.isEmpty()) {
            while (!popStack.isEmpty()) {
                pushStack.push(popStack.pop());
            }

        }
        pushStack.push(x);
    }

    public int pop() {
        while (!pushStack.isEmpty()) {
            popStack.push(pushStack.pop());
        }
        int ans= popStack.pop();
        top= popStack.isEmpty()?-1:popStack.peek();
        return ans;
    }

    public int peek() {
        return top;
    }

    public boolean empty() {
        return pushStack.isEmpty() && popStack.isEmpty() ? true : false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */