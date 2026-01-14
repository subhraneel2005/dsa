// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class L4 {
    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        cycleSort(arr);
        List<Integer> missingElements = findMissingElements(arr);
        System.out.println("missing elements are: " + missingElements);
    }

    static void cycleSort(int[] arr) {
        // 1-n
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                // swap i and correct
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static List<Integer> findMissingElements(int[] arr) {
        ArrayList<Integer> missings = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 != i) {
                missings.add(i + 1);
            }
        }

        return missings;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}