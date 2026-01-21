
// https://leetcode.com/problems/kth-missing-positive-number/
import java.util.ArrayList;

public class KthMissing {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;
        int ans = findK(arr, k);
        System.out.println("kth missing: " + ans);
    }

    static int findK(int[] arr, int k) {
        ArrayList<Integer> missingValues = new ArrayList<>();
        int lastElement = arr[arr.length - 1];

        for (int i = 0; i <= lastElement + k; i++) {
            boolean exists = false;

            for (int elm : arr) {
                if (elm == i + 1) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                missingValues.add(i + 1);
            }

        }

        return missingValues.get(k - 1);
    }

}