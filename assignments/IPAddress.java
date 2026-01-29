
// https://leetcode.com/problems/defanging-an-ip-address/

public class IPAddress {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));
    }

    static String defangIPaddr(String address) {

        StringBuilder sb = new StringBuilder();

        char[] arr = address.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '.') {
                sb.append('[');
                sb.append(arr[i]);
                sb.append(']');
            } else {
                sb.append(arr[i]);
            }
        }

        return sb.toString();
    }
}