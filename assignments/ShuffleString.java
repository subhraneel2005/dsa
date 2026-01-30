import java.util.HashMap;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "abc";
        int[] indices = { 0, 1, 2 };

        System.out.println(restoreString(s, indices));
    }

    static String restoreString(String s, int[] indices) {

        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Character> map = new HashMap<>();
        char[] letters = s.toCharArray();

        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], letters[i]);
        }

        cycleSort(indices);

        for (char c : map.values()) {
            sb.append(c);
        }

        return sb.toString();
    }

    static void cycleSort(int[] indices) {
        int i = 0;
        while (i < indices.length) {
            int correctIdx = indices[i];

            if (indices[i] != indices[correctIdx]) {
                swap(indices, i, correctIdx);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}