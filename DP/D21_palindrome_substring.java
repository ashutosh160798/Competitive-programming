import java.util.Scanner;

public class D21_palindrome_substring {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(count(s.next()));
    }

    private static int count(String str) {

        boolean[][] dp = new boolean[str.length()][str.length()];
        int ans = 0;
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = true;
            ans++;
        }
        for (int i = 1; i < dp.length; i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                dp[i - 1][i] = true;
                ans++;
            }
        }
        for (int gap = 2; gap < dp.length; gap++) {
            for (int i = 0, j = i + gap; j < dp[0].length; i++, j++) {
                if (str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    ans++;
                }
            }
        }
        return ans;

    }

}
