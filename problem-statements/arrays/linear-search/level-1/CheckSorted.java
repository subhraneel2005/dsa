
import java.util.Scanner;

public class CheckSorted {

    static int[] arr = new int[5];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        takeInput();
        checkIfSorted();
    }

    static void takeInput() {
        System.out.println("Enter arrays elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static void checkIfSorted() {
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted == true) {
            System.out.println("Array is Sorted");
        } else if (isSorted == false) {
            System.out.println("Array is not Sorted");
        }
    }

}
