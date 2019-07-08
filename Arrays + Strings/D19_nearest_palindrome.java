import java.util.*;

class D19_nearest_palindrome {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String n = scn.next();
        System.out.println(nearestPalindromic(n));
    }

    // -----------------------------------------------------
    // This is a functional problem. Don't modify main
    // This function takes as input a string
    // It should return required output.
    public static String nearestPalindromic(String n) {

        String s1 = "", s2 = "", s3 = "";
        int len = n.length();
        if (checkPalindrome(n)) {
            return n;
        }
        if (n.length() % 2 == 0) {
            int half = Integer.parseInt(n.substring(0, len / 2));
            s1 = half + rev(half + "");
            s2 = (half - 1) + rev((half - 1) + "");
            if (s2.length() < s1.length())
                s2 += "9";
            s3 = (half + 1) + rev((half + 1) + "");


        } else {
            int half = Integer.parseInt(n.substring(0, len / 2 + 1));
            s1 = half + rev(half + "").substring(1);
            s2 = (half - 1) + rev((half - 1) + "").substring(1);
            if (s2.length() < s1.length())
                s2 += "9";
            s3 = (half + 1) + rev((half + 1) + "").substring(1);

        }
        if (Math.abs(Integer.parseInt(s1) - Integer.parseInt(n))
                < Math.abs(Integer.parseInt(s2) - Integer.parseInt(n))
                && Math.abs(Integer.parseInt(s1) - Integer.parseInt(n))
                < Math.abs(Integer.parseInt(s3) - Integer.parseInt(n))) {
            return s1;
        } else if (Math.abs(Integer.parseInt(s2) - Integer.parseInt(n))
                > Math.abs(Integer.parseInt(s3) - Integer.parseInt(n))) {
            return s3;
        } else {
            return s2;
        }

    }

    private static String rev(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }

    private static boolean checkPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1)) {
                return false;
            }
        }
        return true;
    }
}