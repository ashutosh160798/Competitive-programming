import java.util.Scanner;

public class D21_min_cost_path_tab {

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
        System.out.println(cost(mat));

    }

    private static int cost(int[][] costs) {

        int rows = costs.length;
        int cols = costs[0].length;
        int dp[][] = new int[rows][cols];
        int sum = 0;
        for (int i = rows - 1; i >= 0; i--) {
            sum += costs[i][cols - 1];
            dp[i][cols - 1] = sum;
        }
        sum = 0;
        for (int i = cols - 1; i >= 0; i--) {
            sum += costs[rows - 1][i];
            dp[rows - 1][i] = sum;
        }

        for (int i = rows - 2; i >= 0; i--) {
            for (int j = cols - 2; j >= 0; j--) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + costs[i][j];
            }
        }
        String path = "";
        printPath(dp, 0, 0, dp.length - 1, dp[0].length - 1, path);
        return dp[0][0];

    }

    private static void printPath(int[][] dp, int sr, int sc, int dr, int dc, String path) {

        if (sc == dc && sr == dr) {
            System.out.println(path);
            return;
        }
        if (sr == dr) {
            printPath(dp, sr, sc + 1, dr, dc, path + "right ");
        }
        if (sc == dc) {
            printPath(dp, sr + 1, sc, dr, dc, path + "down ");
        }
        if (sc != dc && sr != dr) {
            int min = Math.min(dp[sr + 1][sc], dp[sr][sc + 1]);
            if (dp[sr + 1][sc] == min) {
                printPath(dp, sr + 1, sc, dr, dc, path + "down ");
            }
            if (dp[sr][sc + 1] == min) {
                printPath(dp, sr, sc + 1, dr, dc, path + "right ");
            }
        }

    }

}
