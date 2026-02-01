public class WaysToSplitString {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        String s = "10101";
        System.out.println(split(s));
    }

    static int split(String s) {

        long ways1 = 0;
        long ways2 = 0;

        int totalOnesCount = 0;

        int onesSeen = 0;

        int totalParts = 3;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                totalOnesCount++;
            }
        }
        if (totalOnesCount % totalParts != 0)
            return 0;

        if (totalOnesCount == 0) {
            long gaps = s.length() - 1;
            return (int) ((gaps * (gaps - 1) / 2) % MOD);
        }

        int onesPerCut = totalOnesCount / totalParts;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1')
                onesSeen++;

            if (onesSeen == onesPerCut)
                ways1++;
            if (onesSeen == 2 * onesPerCut)
                ways2++;
        }
        return (int) ((ways1 * ways2) % MOD);

    }
}