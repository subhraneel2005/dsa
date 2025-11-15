
import java.util.Arrays;
import java.util.Scanner;

public class FindChar {

    static Scanner sc = new Scanner(System.in);
    static char charToFind;
    static boolean isRepeated = false;
    static int charCount = 0;

    public static void main(String[] args) {
        findChar();
    }

    static void findChar() {
        System.out.print("Enter a String: ");
        String str = sc.next();

        System.out.print("Enter character to find: ");
        charToFind = sc.next().charAt(0); //takes the first index (character) from the string

        char[] arr = str.toCharArray();

        System.out.println("String broken down into character array:" + "\n" + Arrays.toString(arr));

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == charToFind) {
                charCount++;
                if (charCount > 1) {
                    isRepeated = true;
                }
                System.err.println("Char found at index: " + i);
            }
        }

        System.out.println("Count = " + charCount);
        System.out.println("Is repeated = " + isRepeated);

        if (charCount == 0) {
            System.out.println("Character not found in the String");
        }

    }
}
