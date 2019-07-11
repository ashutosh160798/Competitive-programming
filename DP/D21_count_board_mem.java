import java.util.Scanner;

public class D21_count_board_mem {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int src = s.nextInt();
        int dest = s.nextInt();
        System.out.println(count(src, dest, new int[dest - src + 1]));

    }

    private static int count(int src, int dest, int[] dp) {

        if (src > dest)
            return 0;
        if (src == dest)
            return 1;
        if (dp[src] != 0)
            return dp[src];

        int stod = 0;
        for (int i = 1; i <= 6; i++) {
            int x = src + i;
            stod += count(x, dest, dp);
        }
        dp[src] = stod;
        return stod;

    }
}
