
import java.util.ArrayList;
import java.util.Scanner;

public class MissingId {

    static int[] ids = new int[5];
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> missingIds = new ArrayList<>();

    public static void main(String[] args) {
        takeInput();
        findMissingId();
    }

    static void takeInput() {
        System.out.println("Enter IDs: ");

        for (int i = 0; i < ids.length; i++) {
            ids[i] = sc.nextInt();
        }
    }

    static void findMissingId() {
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i + 1] - ids[i] != 1) {
                missingIds.add(ids[i] + 1);
            }
        }
        System.out.println("Missing IDs: " + missingIds);
    }
}
