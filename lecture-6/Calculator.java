
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int res = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.err.print("Enter operator: ");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                switch (op) {
                    case '+':
                        res = num1 + num2;
                        System.out.println("Result: " + res);
                        continue;

                    case '-':
                        res = num1 - num2;
                        System.out.println("Result: " + res);
                        continue;

                    case '*':
                        res = num1 * num2;
                        System.out.println("Result: " + res);
                        continue;

                    case '/':
                        if (num2 != 0) {
                            res = num1 - num2;
                            System.out.println("Result: " + res);
                            continue;

                        } else {
                            System.out.println("Cannot divide by zero");

                        }
                    case '%':
                        if (num2 != 0) {
                            res = num1 % num2;
                            System.out.println("Result: " + res);
                            continue;

                        } else {
                            System.out.println("Cannot find modulus by zero");
                        }
                    case 'x':
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please enter valid operator");
                }
            } else {
                System.out.println("Please enter valid operator");
            }
        }
    }
}
