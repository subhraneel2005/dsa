
import java.util.Scanner;

public class DailySales {

    static Scanner sc = new Scanner(System.in);
    static int[] dailySales = new int[5];

    public static void main(String[] args) {
        takeInput();
        findMinMax();
    }

    static void takeInput() {
        for (int i = 0; i < dailySales.length; i++) {
            dailySales[i] = sc.nextInt();
        }
        sc.close();
    }

    static void findMinMax() {
        int min = dailySales[0];
        int max = dailySales[0];
        for (int i = 0; i < dailySales.length; i++) {
            if (dailySales[i] > max) {
                max = dailySales[i];
            } else if (dailySales[i] < min) {
                min = dailySales[i];
            }
        }
        System.err.println("Min: " + min);
        System.err.println("Max: " + max);
    }
}
