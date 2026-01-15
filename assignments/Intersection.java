// https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int nums1[] = { 4, 9, 5 };
        int nums2[] = { 9, 4, 9, 8, 4 };

        bubbleSort(nums1);
        bubbleSort(nums2);

        List<Integer> intersection = findIntersection(nums1, nums2);

        Integer[] inArray = intersection.toArray(Integer[]::new);

        System.out.println(intersection);

    }

    static void bubbleSort(int[] arr) {
        boolean isSwapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }

                isSwapped = true;
            }

            if (!isSwapped) {
                break;
            }
        }
    }

    static void swap(int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

    static List<Integer> findIntersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !ans.contains(nums1[i])) {
                    ans.add(nums1[i]);
                }
            }
        }

        return ans;
    }
}
