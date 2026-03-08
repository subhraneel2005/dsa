import java.util.Collections;
import java.util.Stack;

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<Integer>();

        push(1, s);
        push(2, s);
        push(3, s);
        push(4, s);

        System.out.println(s);

        System.out.println(pop(s));

    }

    static void push(int x, Stack<Integer> s) {
        Collections.reverse(s);
        s.push(x);
        Collections.reverse(s);
    }

    static int pop(Stack<Integer> s) {
        if (!s.isEmpty()) {
            return s.pop();
        }
        return -1;
    }

    static int peek(Stack<Integer> s) {
        if (!s.isEmpty()) {
            return s.peek();
        }
        return -1;
    }

    static boolean empty(Stack<Integer> s) {
        if (s.isEmpty()) {
            return true;
        }
        return false;
    }

}