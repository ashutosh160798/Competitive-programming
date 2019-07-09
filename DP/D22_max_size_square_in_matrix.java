import java.util.Arrays;
import java.util.Scanner;

public class D22_max_size_square_in_matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(maxSizeSq(mat));
    }

    private static int maxSizeSq(int[][] matrix) {

        int max = Integer.MIN_VALUE;
        int[][] dp = Arrays.copyOf(matrix, matrix.length);

        for (int i = dp.length - 2; i >= 0; i--) {
            for (int j = dp[0].length - 2; j >= 0; j--) {
                if (matrix[i][j] == 0) {
                    dp[i][j] = 0;
                    continue;
                }
                dp[i][j] = 1 + Math.min(dp[i + 1][j + 1], Math.min(dp[i][j + 1], dp[i + 1][j]));
                max = Math.max(max, dp[i][j]);
            }
        }

        return max;
    }
}
