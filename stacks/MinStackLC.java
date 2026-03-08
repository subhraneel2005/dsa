import java.util.Collections;
import java.util.Stack;

public class MinStackLC {

    static Stack<Integer> s;
    static Stack<Integer> minimums;

    public MinStackLC() {
        s = new Stack<Integer>();
        minimums = new Stack<Integer>();
    }

    static void push(int val) {
        if (!s.isEmpty()) {
            if (val < minimums.peek()) {
                minimums.push(val);
                s.push(val);
            } else {
                minimums.push(s.peek());
                s.push(val);
            }
        } else {
            s.push(val);
            minimums.push(val);
        }
    }

    static void pop() {
        if (!s.isEmpty()) {
            s.pop();
            minimums.pop();
        }
    }

    static int top() {
        if (!s.isEmpty()) {
            return s.peek();
        }
        return -1;
    }

    static int getMin() {
        if (!minimums.isEmpty()) {
            return minimums.peek();
        }
        return -1;
    }

    public static void main(String[] args) {
        MinStackLC obj = new MinStackLC();

        obj.push(-2);
        obj.push(0);
        obj.push(-3);

        System.out.println(obj.getMin()); // check
        obj.pop();
        System.out.println(obj.top()); // check
        System.out.println(obj.getMin()); // check
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */