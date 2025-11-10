
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        twoDihsArr();
    }

    static void twoDihsArr() {
        int arr[][] = new int[2][2];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter number " + (j + 1) + ": ");
                arr[i][j] = input.nextInt();
            }
        }
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
