import java.util.Collections;
import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        push(-2, s);
        push(0, s);

        System.out.println(s);

        System.out.println(top(s));

    }

    static void push(int val, Stack<Integer> s) {
        s.push(val);
    }

    static void pop(Stack<Integer> s) {
        if (!s.isEmpty())
            s.pop();
    }

    static int top(Stack<Integer> s) {
        if (!s.isEmpty()) {
            return s.peek();
        }
        return -1;
    }

    static int getMin(Stack<Integer> s) {
        if (!s.isEmpty()) {
            Collections.sort(s);
            return s.get(0);
        }
        return -1;
    }

}