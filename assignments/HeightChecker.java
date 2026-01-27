import java.util.ArrayList;
import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] height = { 1, 1, 4, 2, 1, 3 };
        int ans = findUnmatches(height);
        System.out.println(ans);
    }

    static int findUnmatches(int[] height) {

        int[] original = Arrays.copyOf(height, height.length);

        bubbleSort(height);

        int count = 0;

        for (int i = 0; i < height.length; i++) {
            if (height[i] != original[i])
                count++;
        }

        return count;
    }

    static void bubbleSort(int[] height) {

        for (int i = 0; i < height.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < height.length - i - 1; j++) {
                if (height[j] > height[j + 1]) {
                    swap(height, j, j + 1);
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
}