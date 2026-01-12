import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 1, 2 };
        cycleSort(arr);
        System.out.println("sorted array: " + Arrays.toString(arr));
    }

    static void swapIdx(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int actualIndexOfCurrentElement = arr[i] - 1; // this is the correct index of arr[i]

            if (arr[i] != arr[actualIndexOfCurrentElement]) {
                swapIdx(arr, i, actualIndexOfCurrentElement);
            } else {
                i++;
            }
        }
    }
}