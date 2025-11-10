
import java.util.ArrayList;
import java.util.Scanner;

class ArrayLists {

    static int arrLength = 5;
    static int listLength = 2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<String>> list = new ArrayList<>();

        // [[], []]
        for (int i = 0; i < listLength; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < listLength; i++) {
            for (int j = 0; j < arrLength; j++) {
                list.get(i).add(in.next());
            }
        }

        System.out.println("\nLIST\n" + list);

    }
}
