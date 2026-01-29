public class SingleElm {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3 };
        System.out.println(findSingleElement(arr));
    }

    static int findSingleElement(int[] arr) {

        int end = arr.length - 1;
        int start = 0;

        if (arr.length == 1) {
            return arr[0];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid % 2 == 1)
                mid--;

            if (arr[mid] == arr[mid + 1]) {
                start = mid + 2;
            } else {
                end = mid;
            }

        }

        return arr[end];
    }

}