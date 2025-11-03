
import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        if (salary < 10000) {
            System.out.println("Kya re bhik-mangaya?");
        } else if (salary > 10000 && salary < 50000) {
            System.out.println("Aap average aadmi ho.");
        } else {
            System.out.println("Aap bahut ameer ho!");
        }
    }
}
