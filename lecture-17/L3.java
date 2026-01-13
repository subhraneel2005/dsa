// leetcode question: https://leetcode.com/problems/missing-number/

public class L3 {
    public static void main(String[] args) {
        int[] arr = { 0, 1 };
        int n = arr.length;
        sort(arr, n);
        int missingElement = findMissing(arr, n);
        System.out.println("missing element is: " + missingElement);
    }

    static int findMissing(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return n;
    }

    static void sort(int[] arr, int n) {
        // n = length of the array
        // ignore n because original length of the array should be n+1

        int i = 0;

        while (i < n) {
            int correct = arr[i];

            if (arr[i] < n && arr[i] != arr[correct]) {
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
}