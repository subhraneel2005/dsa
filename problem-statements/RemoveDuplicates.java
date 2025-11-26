
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {

    static Scanner sc = new Scanner(System.in);
    static int[] cart = new int[5];
    static ArrayList<Integer> newCart = new ArrayList<>();

    public static void main(String[] args) {
        takeInput();
        for (int i = 0; i < cart.length; i++) {
            boolean exists = false;
            for (Integer n : newCart) {
                if (cart[i] == n) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                newCart.add(cart[i]);
            }
        }

        System.out.println("Clean cart " + newCart);
    }

    static void takeInput() {
        for (int i = 0; i < cart.length; i++) {
            cart[i] = sc.nextInt();
        }
        sc.close();
    }
}
