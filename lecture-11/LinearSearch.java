
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    static Scanner sc = new Scanner(System.in);
    static int[] arr = new int[5];

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter array element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray\n" + Arrays.toString(arr) + "\n");
        System.out.print("Enter element to find: ");
        int elementToFind = sc.nextInt();
        findElement(elementToFind);
    }

    static boolean findElement(int n) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Element found at index " + i);
                return true;
            }
        }
        System.out.println("Element doesn't exists in array");
        return false;
    }
}
// define an array -> inside a for loop find for arr[i] === 14 -> return true if found, if not found i++
