
import java.util.Scanner;

public class Ums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("You selected Students section.");
                System.out.print("1. View grades\n2. Pay fees \nBack to main menu\nEnter student choice: ");
                int studntChoice = sc.nextInt();

                switch (studntChoice) {
                    case 1 ->
                        System.out.println("You selected: View grades.");
                    case 2 ->
                        System.out.println("You selected: Pay fees.");
                    case 3 ->
                        System.out.println("You selected: Back to menu.");
                }
            }

            case 2 -> {
                System.out.println("You selected Faculty section.");
                System.out.print("1. View Class Schedule\n2. Mark Attendence\n3. Back to main menu\nEnter faculty choice: ");
                int facultyChoice = sc.nextInt();

                switch (facultyChoice) {
                    case 1 ->
                        System.out.println("You seleted: View Class Schedule.");
                    case 2 ->
                        System.out.println("You seleted: Mark Attendence.");
                    case 3 ->
                        System.out.println("You seleted: Back to main menu.");
                }
            }

            case 3 -> {
                System.out.println("You selected: Exit.");
                System.exit(0);
            }
        }
    }
}
