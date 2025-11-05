
public class Count {

    public static void main(String[] args) {
        int n = 12223456;
        int numToFind = 2;

        int count = 0;

        while (n > 0) {
            int d = n % 10;
            if (d == numToFind) {
                count++;
            }
            n = n / 10;
        }

        System.out.println("Count of " + numToFind + " is: " + count);
    }
}
