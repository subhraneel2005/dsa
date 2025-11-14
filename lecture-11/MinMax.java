
public class MinMax {

    static int[] arr = {21, 3, 4, 7, 8, 12, 43};
    static int min = arr[0];
    static int max = arr[0];

    public static void main(String[] args) {
        findMin();
        findMax();
    }

    static void findMin() {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        System.out.println("Min element: " + min);
    }

    static void findMax() {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max element is: " + max);
    }
}
