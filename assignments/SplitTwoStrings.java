public class SplitTwoStrings {
    public static void main(String[] args) {
        String a = "abdef";
        String b = "fecab";

        System.out.println(checkPalindromeFormation(a, b));

    }

    static boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }

    static boolean check(String a, String b) {

        int left = 0;
        int right = b.length() - 1;

        while (left < right) {
            if (a.charAt(left) == b.charAt(right)) {
                left++;
                right--;
            } else {
                return isPalindrome(a, left, right) || isPalindrome(b, left, right);
            }
        }

        return true;
    }

    static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}