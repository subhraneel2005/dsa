
public class Methods {

    public static void main(String[] args) {
        divide();

        int modulusResult = modulus(1234, 10);
        System.out.println("Modulus result: " + modulusResult);
        String greeting = greeting("KelaChuda");
        System.out.println(greeting);
        char grade = grade(93);
        System.out.println("Grade: " + grade);

    }

    static int sum(int num1, int num2) {
        return num1 + num2;
    }

    //method without return type and parameters
    static void divide() {
        int a, b, result;
        a = 10;
        b = 5;
        result = a / b;
        System.out.println("Division Result: " + result);
    }

    // method with retrn type ad parameters
    static int modulus(int a, int b) {
        return a % b;
    }

    // string return type method
    static String greeting(String name) {
        return "Hello " + name;
    }

    // character return type method
    static char grade(int marks) {
        if (marks >= 90 && marks <= 100) {
            return 'A';
        } else if (marks >= 80 && marks < 90) {
            return 'B';
        } else if (marks >= 70 && marks < 80) {
            return 'C';
        } else if (marks >= 60 && marks < 70) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
