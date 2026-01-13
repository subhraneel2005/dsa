// https://leetcode.com/problems/majority-element/description/

import java.util.HashMap;
import java.util.Map;

public class L2 {
    public static void main(String[] args) {

        int[] nums = { 3, 2, 3 };
        int n = nums.length;

        int majElm = findMajorityElement(nums, n);

        System.out.println("majority element is: " + majElm);

    }

    static int findMajorityElement(int[] nums, int n) {
        int ans = 0;

        HashMap<Integer, Integer> countPairs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (countPairs.containsKey(nums[i])) {
                countPairs.put(nums[i], countPairs.get(nums[i]) + 1);
            } else {
                countPairs.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : countPairs.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            if (count > n / 2) {
                ans = element;
            }
        }

        return ans;
    }

    // n = length of the array
    // majority element should be greater than n/2
}