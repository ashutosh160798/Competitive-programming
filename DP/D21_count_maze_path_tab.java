import java.util.Scanner;

public class D21_count_maze_path_tab {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sr = s.nextInt();
        int sc = s.nextInt();
        int dr = s.nextInt();
        int dc = s.nextInt();
        System.out.println(count(sr, sc, dr, dc));

    }

    private static int count(int sr, int sc, int dr, int dc) {

        int[][] dp = new int[dr + 1][dc + 1];
        for (int i = dc; i >= sc; i--) {
            dp[dr][i] = 1;
        }
        for (int i = dr; i >= sr; i--) {
            dp[i][dc] = 1;
        }
        for (int i = dr - 1; i >= sr; i--) {
            for (int j = dc - 1; j >= sc; j--) {
                dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
            }
        }
        return dp[sr][sc];
    }


}
