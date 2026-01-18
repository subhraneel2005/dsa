import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindContent {
    public static void main(String[] args) {
        int[] g = { 1, 2, 3 };
        int[] s = { 1, 1 };

        int ans = findContentChildren(g, s);

        System.out.println(ans);
    }

    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // child pointer
        int j = 0; // cookie pointer

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
            }
            j++;
        }

        return i;
    }
}