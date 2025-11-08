
import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;
        // swap(a, b);
        // System.out.println("IN MAIN FUNCTION\na=" + a + "\nb=" + b);

        int[] arr = {10, 20, 30, 40, 50, 60};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeValue(int arr[]) {
        arr[0] = 69;
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("INSIDE SWAP FUNCTION\na=" + a + "\nb=" + b);
    }
}
