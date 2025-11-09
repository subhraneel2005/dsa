
import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        kyaRe(10, 23, "name1", "name2", "name3");
    }

    static void kyaRe(int a, int b, String... v) {
        System.out.println(a + " " + b);
        System.out.println(Arrays.toString(v));
    }
}
