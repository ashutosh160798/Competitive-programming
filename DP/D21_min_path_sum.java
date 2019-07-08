import java.util.*;

public class D21_min_path_sum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int m2[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m2[i][j] = scn.nextInt();
            }
        }
        System.out.println(maze(m2));
    }
    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input a 2D array
    // It should return the required output

    public static int maze(int[][] m) {

        int rows = m.length;
        int cols = m[0].length;
        int[][] dp = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(i==0&&j==0)
                    dp[0][0] = m[0][0];
                else if(i==0)
                    dp[i][j] = m[i][j] + dp[i][j-1];
                else
                    dp[i][j] = m[i][j] + dp[i-1][j];
            }
        }
        return dp[rows-1][cols-1];

    }
}