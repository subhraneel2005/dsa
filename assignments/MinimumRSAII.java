public class MinimumRSAII {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 2, 0, 1 };
        System.out.println(findMin(nums));
    }

    static int findMin(int[] nums) {
        // case 1 : already sorted
        int pivotIdx = findPivot(nums);

        if (pivotIdx == -1)
            return nums[0];

        // case 2: rotated

        return nums[pivotIdx + 1];
    }

    static int findPivot(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }

        return -1;
    }
}