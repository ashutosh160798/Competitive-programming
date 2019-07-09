import java.util.Scanner;

public class D21_count_maze_path_mem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sr = s.nextInt();
        int sc = s.nextInt();
        int dr = s.nextInt();
        int dc = s.nextInt();
        System.out.println(count(sr, sc, dr, dc, new int[dr + 1][dc + 1]));

    }

    private static int count(int sr, int sc, int dr, int dc, int[][] dp) {
        if (sc == dc && sr == dr)
            return 1;
        if (sc > dc || sr > dr)
            return 0;
        if(dp[sr][sc]!=0)
            return dp[sr][sc];
        int ans = 0;
        int v = count(sr + 1, sc, dr, dc, dp);
        int h = count(sr, sc + 1, dr, dc, dp);
        ans += v + h;
        dp[sr][sc] = ans;
        return ans;

    }

}
