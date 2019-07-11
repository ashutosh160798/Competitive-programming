import java.util.Arrays;
import java.util.Scanner;

public class D22_gold_mine_tab {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] mat = new int[r][c];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = s.nextInt();
            }
        }
        System.out.println(profit(mat));
    }

    private static int profit(int[][] mat) {
        int[][] dp = Arrays.copyOf(mat, mat.length);
        for (int i = mat[0].length - 2; i >= 0; i--) {
            for (int j = 0; j < mat.length; j++) {
                if (j == 0) {
                    dp[j][i] = Math.max(dp[j][i + 1], dp[j + 1][i + 1]) + mat[j][i];
                    continue;
                }
                if (j == mat.length - 1) {
                    dp[j][i] = Math.max(dp[j][i + 1], dp[j - 1][i + 1]) + mat[j][i];
                    continue;
                }
                dp[j][i] = Math.max(Math.max(dp[j][i + 1], dp[j - 1][i + 1]), dp[j + 1][i + 1]) + mat[j][i];
            }
        }
        int ans = 0;
        for (int i = 0; i < mat.length; i++) {
            ans = Math.max(ans, mat[i][0]);
        }
        return ans;
    }


}
