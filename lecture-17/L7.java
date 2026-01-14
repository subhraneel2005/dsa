// https://leetcode.com/problems/set-mismatch

import java.util.Arrays;

public class L7 {
    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        int[] ans = findMismatch(arr);
        System.out.println("mismatch is :" + Arrays.toString(ans));
    }

    static int[] findMismatch(int[] arr) {

        int[] ans = { -1, -1 };
        int i = 0;
        int n = arr.length;

        // range 1-m, so the correct index will always be current element - 1
        while (i < n) {
            int correctIdx = arr[i] - 1;

            if (arr[i] != arr[correctIdx]) {
                swap(arr, i, correctIdx);
            } else {
                if (arr[i] != i + 1) {
                    ans[0] = arr[i];
                    ans[1] = i + 1;
                }
                i++;
            }
        }

        return ans;

    }

    static void swap(int[] arr, int f, int s) {
        int t = arr[f];
        arr[f] = arr[s];
        arr[s] = t;
    }
}