import java.util.HashSet;
import java.util.Scanner;

public class D14_longest_substring_without_repeating_chars {
    public static int lengthOfLongestSubstring(String s) {

        int i = 0;
        int j = 0;
        int length = 0;
        HashSet<Character> set = new HashSet<>();
        while (i < s.length() && j < s.length()) {
            while (i < s.length() && !set.contains(s.charAt(i))) {
                set.add(s.charAt(i++));
            }
            length = Math.max(length, set.size());
            set.remove(s.charAt(j++));
        }
        return length;

    }

    //Don't make any changes here.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(lengthOfLongestSubstring(str));

    }

}