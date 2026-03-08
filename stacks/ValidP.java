import java.util.Stack;

public class ValidP {

    public static void main(String[] args) {
        String s = "[){)}][([)]";
        System.out.println(checkInputString(s));
    }

    static boolean checkInputString(String input) {

        Stack<Character> charStack = new Stack<>();

        for (Character c : input.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                charStack.push(c);
            }

            else if (c == ')') {
                if (charStack.isEmpty() || charStack.pop() != '(') {
                    return false;
                }
            }

            else if (c == ']') {
                if (charStack.isEmpty() || charStack.pop() != '[') {
                    return false;
                }
            }

            else if (c == '}') {
                if (charStack.isEmpty() || charStack.pop() != '{') {
                    return false;
                }
            }
        }

        return charStack.isEmpty() ? true : false;
    }
}
