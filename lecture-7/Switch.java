
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n-----WELCOME TO MY LITTLE CAFE-----\n\nMENU\n1. Cold Coffee\n2. Macha Tea\n3. Chicken Sandwich\n4. CheeseCake\n5. Exit");
        System.out.print("\nEnter your choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("You selected Cold Coffee");
                System.out.println("Price: Rs. 120");
            }

            case 2 -> {
                System.out.println("You selected Macha Tea");
                System.out.println("Price: Rs. 220");
            }
            case 3 -> {
                System.out.println("You selected Chicken Sandwich");
                System.out.println("Price: Rs. 180");
            }
            case 4 -> {
                System.out.println("You selected CheeseCake");
                System.out.println("Price: Rs. 190");
            }
            case 5 -> {
                System.out.println("Thank you for visiting! Have a great day!");
                System.exit(0);
            }
            default ->
                System.out.println("Inalid Choice! Please select a valid option from the menu.");
        }
    }
}
