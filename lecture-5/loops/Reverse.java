
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = i.nextInt();
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        System.out.println("Reversed number is: " + reverse);
    }
}
