import java.util.Scanner;

public class D21_min_cost_path_mem {

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
        System.out.println(cost(mat, 0, 0, r - 1, c - 1, new int[r][c]));

    }

    private static int cost(int[][] costs, int sr, int sc, int dr, int dc, int[][] dp) {

        if (sc > dc || sr > dr) {
            return Integer.MAX_VALUE;
        }
        if (sc == dc && sr == dr) {
            return costs[dr][dc];
        }
        if (dp[sr][sc] != 0)
            return dp[sr][sc];

        int v = cost(costs, sr + 1, sc, dr, dc, dp);
        int h = cost(costs, sr, sc + 1, dr, dc, dp);
        dp[sr][sc] = Math.min(v, h) + costs[sr][sc];
        return dp[sr][sc];

    }

}
