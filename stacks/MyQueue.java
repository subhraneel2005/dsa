import java.util.Stack;
import java.util.Collections;

public class MyQueue {

    Stack<Integer> s;

    public MyQueue() {
        s = new Stack<Integer>();
    }

    public void push(int x) {
        Collections.reverse(s);
        s.push(x);
        Collections.reverse(s);
    }

    public int pop() {
        if (!s.isEmpty()) {
            return s.pop();
        }
        return -1;
    }

    public int peek() {
        if (!s.isEmpty()) {
            return s.peek();
        }
        return -1;
    }

    public boolean empty() {
        if (s.isEmpty()) {
            return true;
        }
        return false;
    }
}
