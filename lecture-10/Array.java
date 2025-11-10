
import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        primitive();
        complex();
    }

    static void primitive() {
        long[] ids = new long[3];

        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < ids.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            ids[i] = inp.nextLong();
        }

        System.out.println("Final array " + Arrays.toString(ids));
    }

    static void complex() {
        String[] names = new String[3];
        Scanner inp = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ":");
            names[i] = inp.nextLine();
        }

        System.out.println("Final Array: " + Arrays.toString(names));
    }
}
