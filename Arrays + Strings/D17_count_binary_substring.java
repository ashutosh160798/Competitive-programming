import java.util.*;

class D17_count_binary_substring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.print(countBinarySubstrings(s));
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input a string
    // It should return the required output

    public static int countBinarySubstrings(String s) {

        String prev = "";
        String curr = "";
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            curr = curr + s.charAt(i);
            if (curr.length() <= prev.length()) {
                ans++;
            }
            if (i < s.length() - 1 && s.charAt(i) != s.charAt(i + 1)) {
                prev = curr;
                curr = "";
            }

        }
        return ans;

    }

}