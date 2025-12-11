
public class BsFloor {

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 7, 8, 9, 22, 33, 42, 55, 67, 88};
        int target = 30;

        int res = binarySearch(arr, target);
        System.out.println(res);
    }

    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return arr[end];
    }
}
