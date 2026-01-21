// https://leetcode.com/problems/valid-palindrome/

import java.util.Arrays;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "KH KIHS asjdhbasj sda";
        String cleanStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char[] arr = cleanStr.toCharArray();

        System.out.println(Arrays.toString(arr));

        boolean ans = isPalindrome(arr);
        System.out.println(ans);
    }

    static boolean isPalindrome(char[] arr) {

        int i = 0;
        int j = arr.length - 1;
        int notEqualCount = 0;

        while (i < arr.length && j > 0) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } else {
                notEqualCount++;
                i++;
                j--;
            }

        }

        if (notEqualCount > 0) {
            return false;
        } else {
            return true;
        }

    }
}
