
public class OrderAgnosticBS {

    static int[] arr = {100, 72, 55, 42, 30, 18, 10, 5, 1};

    public static void main(String[] args) {

        int target = 55;
        int ans = orderAgnoisticBS(arr, target);
        System.out.println("Target found on index: " + ans);

    }

    static int orderAgnoisticBS(int arr[], int target) {
        int last_idx = arr.length - 1;
        boolean isAsc = false;
        boolean isDesc = false;

        if (arr[0] > arr[last_idx]) {
            System.out.println("code reached #1");
            isDesc = true;
        } else {
            isAsc = true;
        }

        if (isDesc) {

            System.out.println("code reached #2");

            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                System.out.println("code reached #4");

                int mid = start + (end - start) / 2;

                if (target > arr[mid]) {
                    //shift end to left
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    //shift start to right
                    start = mid + 1;
                } else {
                    return mid;
                }

            }
        } else if (isAsc) {
            System.out.println("code reached #3");

            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (target > arr[mid]) {
                    // shift start to right
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    // shift end to left
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }

        return -1;
    }
}
