
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n-----WELCOME TO MY LITTLE CAFE-----\n\nMENU\n1. Cold Coffee - Rs 120\n2. Macha Tea - Rs 220\n3. Chicken Sandwich - Rs 180\n4. CheeseCake - Rs 190\n5. Exit");

        int totalBill = 0;

        while (true) {
            System.out.print("\nEnter choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("You selected Cold Coffee");
                    totalBill += 120;
                    System.out.println("Current bill: Rs. " + totalBill);
                }

                case 2 -> {
                    System.out.println("You selected Macha Tea");
                    totalBill += 220;
                    System.out.println("Current bill: Rs. " + totalBill);
                }
                case 3 -> {
                    System.out.println("You selected Chicken Sandwich");
                    totalBill += 180;
                    System.out.println("Current bill: Rs. " + totalBill);

                }
                case 4 -> {
                    System.out.println("You selected CheeseCake");
                    totalBill += 190;
                    System.out.println("Current bill: Rs. " + totalBill);

                }
                case 5 -> {
                    System.out.println("Your total bill is: Rs." + totalBill);
                    System.out.println("Thank you for visiting! Have a great day!");
                    System.exit(0);
                }
                default ->
                    System.out.println("\nInalid Choice! Please select a valid option from the menu.\n");
            }

        }

    }
}
