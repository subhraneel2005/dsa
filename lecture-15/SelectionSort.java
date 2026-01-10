import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { -1, -23, -44, 0, 1, 4, 3 };
        selectionSort(arr);
        System.out.println("sorted array: " + Arrays.toString(arr));
    }

    static int findMax(int[] arr, int start, int last) {
        int max = start;

        for (int i = start; i <= last; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }

    static void swapElements(int[] arr, int max, int last) {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = findMax(arr, 0, last);
            swapElements(arr, max, last);
        }
    }
}