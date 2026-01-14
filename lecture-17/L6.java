import java.util.ArrayList;
import java.util.List;

public class L6 {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> duplicates = findDuplicates(arr);
        System.out.println("duplicates array:" + duplicates);
    }

    static List<Integer> findDuplicates(int[] arr) {

        int i = 0;
        ArrayList<Integer> duplicates = new ArrayList<Integer>();

        while (i < arr.length) {

            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                // swap i and correct
                swap(arr, i, correct);
            } else {
                if (i != correct && arr[correct] > 0) {
                    duplicates.add(arr[i]);
                    arr[correct] = -arr[correct];
                }
                i++;

            }
        }

        return duplicates;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
