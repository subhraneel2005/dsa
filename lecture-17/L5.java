// https://leetcode.com/problems/find-the-duplicate-number/

public class L5 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 2, 2 };
        cycleSort(arr);
        int duplicate = findDuplicate(arr);
        System.out.println("duplicate element: " + duplicate);
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

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int findDuplicate(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return arr[i];
            }
        }

        return -1;
    }
}
