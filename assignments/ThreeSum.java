// https://leetcode.com/problems/3sum

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int nums[] = { -100, -70, -60, 110, 120, 130, 160 };
        Arrays.sort(nums);
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
    }

    static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> innerList = Arrays.asList(nums[i], nums[j], nums[k]);

                    ans.add(innerList);

                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                    while (j < k && nums[k] == nums[k + 1])
                        k--;
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }

        }
        return ans;
    }
}