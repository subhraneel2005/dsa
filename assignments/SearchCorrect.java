public class SearchCorrect {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int target = 2;

        int ans = findCorrectIndex(arr, target);

        System.out.println(ans);
    }

    static int findCorrectIndex(int[] arr, int target) {
        // already sorted
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (target > arr[m]) {
                s = m + 1;
            } else if (target < arr[m]) {
                e = m - 1;
            } else {
                return m;
            }
        }

        return s;
    }
}