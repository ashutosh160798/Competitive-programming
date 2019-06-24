import java.util.*;

public class D14_longest_palidrome {
    public static int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        boolean flag = false;
        int ans = 0;
        for (char c : map.keySet()) {
            if (map.get(c) % 2 == 0) {
                ans += map.get(c);
            } else {
                if (!flag) {
                    ans += map.get(c);
                    flag = true;
                } else {
                    ans = ans + map.get(c) - 1;
                }
            }
        }

        return ans;


    }

    //Don't make any changes here.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(longestPalindrome(str));

    }

}