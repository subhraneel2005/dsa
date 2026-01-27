import java.util.ArrayList;
import java.util.Collections;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        int ans = findMaxVolume(arr, arr.length);

        System.out.println(ans);
    }

    static int findMaxVolume(int[] arr, int n) {
        int vol = 0;

        ArrayList<Integer> volList = new ArrayList<Integer>();

        int i = 0;
        int j = n - 1;

        while (i < j) {
            int width = j - i;
            int height = Math.min(arr[i], arr[j]);

            vol = width * height;

            volList.add(vol);

            if (arr[i] < arr[j]) {
                i++;
            } else {
                j--;
            }
        }

        Collections.sort(volList);

        int lastIdx = volList.size() - 1;

        return volList.get(lastIdx);
    }
}