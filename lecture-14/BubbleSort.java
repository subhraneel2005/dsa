import java.util.numsays;

public class BubbleSort {
    public static int main(String[] args) {
        int[] nums = { 1, 1, 1, 1, 1, 1, 1, 1 };
        int n = nums.length;
        int target = 7;
        int ans[] = { -1, -1 };

        bubbleSort(nums, n);
        int floor = findFloor(nums, n, target);

        if (floor != -1 && floor == target) {
            ans[0] = target;
            ans[1] = target;

            return 1;
        } else if (ans[0] == -1 && ans[1] == -1) {
            return 0;
        } else {
            int compliment = target - floor;
            int secondElement = bs(nums, compliment, n);

            ans[0] = secondElement;
            ans[1] = floor;

            return ans.length;
        }

    }

    public static int findFloor(int[] nums, int n, int target) {
        int s = 0;
        int e = n - 1;
        int floor = -1;

        while (s <= e) {
            // find floor
            int m = s + (e - s) / 2;

            if (target > nums[m]) {
                floor = nums[m];
                s = m + 1;
            } else if (target < nums[m]) {
                e = m - 1;
            } else {
                return nums[m];
            }
        }
        return floor;
    }

    public static void bubbleSort(int[] nums, int n) {
        boolean isSwappped = false;
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    isSwappped = true;

                }
            }

            if (!isSwappped) {
                break;
            }

        }
    }

    public static int bs(int[] nums, int target, int n) {
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (target > nums[m]) {
                s = m + 1;
            } else if (target < nums[m]) {
                e = m - 1;
            } else {
                return nums[m];
            }
        }
        return -1;
    }
}