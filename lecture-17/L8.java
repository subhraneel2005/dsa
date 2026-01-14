// https://leetcode.com/problems/first-missing-positive

public class L8 {
    public static void main(String[] args) {
        int[] arr = { 3, 4, -1, 1 };
        int ans = findSmallestMissing(arr);
        System.out.println(ans);
    }

    static int findSmallestMissing(int[] arr) {

        int i = 0;
        int n = arr.length;

        // range 1-m, so the correct index will always be current element - 1
        while (i < n) {
            int correctIdx = arr[i] - 1;
            // ignore 0 and negatives
            if (arr[i] > 0 && arr[i] <= n && arr[i] != arr[correctIdx]) {
                swap(arr, i, correctIdx);
            } else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }

        return n + 1;

    }

    static void swap(int[] arr, int f, int s) {
        int t = arr[f];
        arr[f] = arr[s];
        arr[s] = t;
    }
}
