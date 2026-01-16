import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Intersection2 {
    public static void main(String[] args) {
        int nums1[] = { 4, 9, 5 };
        int nums2[] = { 9, 4, 9, 8, 4 };

        List<Integer> ans = minIntersection(nums1, nums2);

        int[] res = new int[ans.size()];

        for (int i = 0; i < res.length; i++) {
            res[i] = ans.get(i);
        }
        System.out.println(Arrays.toString(res));
    }

    static List<Integer> minIntersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> ans = new ArrayList<Integer>();
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums1.length; i++) {
            if (freq.containsKey(nums1[i])) {
                // increment count (value)
                freq.put(nums1[i], freq.get(nums1[i]) + 1);
            } else {
                // add new key-value pair
                freq.put(nums1[i], 1);
            }
        }

        for (int j = 0; j < nums2.length; j++) {
            if (freq.containsKey(nums2[j]) && freq.get(nums2[j]) > 0) {
                // add to list(ans)
                // decrement count of current element from freq
                ans.add(nums2[j]);
                freq.put(nums2[j], freq.get(nums2[j]) - 1);
            }
        }

        return ans;
    }

}