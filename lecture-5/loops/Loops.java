
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many times you want to print your name: ");
        int num = input.nextInt();
        input.nextLine();

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        if (!name.isEmpty()) {
            for (int i = 0; i < num; i++) {
                System.out.println("Kya re?" + " " + name + "\n");
            }
        } else {
            System.out.println("Name cannot be empty");
        }

        input.close();
    }
}
