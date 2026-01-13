// https://leetcode.com/problems/merge-sorted-array/

import java.util.Arrays;

public class L1 {
    public static void main(String[] args) {
        int nums1[] = { -1, 0, 0, 3, 3, 3, 0, 0, 0 }; // m
        int nums2[] = { 1, 2, 2 }; // n
        int m = 6;
        int n = 3;
        int k = m + n - 1;

        merge(nums1, nums2, k);
        sort(nums1, k);

        System.out.println("merged and sorted array: " + Arrays.toString(nums1));
    }

    static void merge(int nums1[], int nums2[], int k) {
        int j = 0;

        for (int i = 0; i <= k; i++) {
            if (j < nums2.length && nums1[i] == 0) {
                nums1[i] = nums2[j++];
            }
        }
    }

    static void sort(int[] nums1, int k) {
        boolean isSwappped = false;

        for (int i = 0; i < nums1.length - 1; i++) {
            for (int j = 0; j < nums1.length - i - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;

                    isSwappped = true;
                }
            }

            if (!isSwappped) {
                break;
            }
        }
    }
}