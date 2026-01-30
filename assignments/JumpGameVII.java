
// https://leetcode.com/problems/jump-game-vii/description/
public class JumpGameVII {
    public static void main(String[] args) {
        String s = "0000000000";
        int minJump = 2;
        int maxJump = 5;

        System.out.println(canReach(s, minJump, maxJump));
    }

    static boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        if (s.charAt(n - 1) == '1') {
            return false;
        }

        boolean[] can = new boolean[n];
        can[0] = true;

        int farthest = 0;

        for (int i = 0; i < n; i++) {

            if (can[i] == false) {
                continue;
            }

            int start = Math.max(i + minJump, farthest + 1);
            int end = Math.min(i + maxJump, n - 1);

            for (int j = start; j <= end; j++) {
                if (s.charAt(j) == '0') {
                    can[j] = true;
                }
            }

            farthest = Math.max(farthest, end);
        }

        return can[n - 1];
    }
}