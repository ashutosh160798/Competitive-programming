import java.util.Scanner;

public class D21_rod_cut_mem {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        System.out.println(maxProfit(a, n-1,new int[n]));

    }

    private static int maxProfit(int[] a, int n, int[] dp) {

        if (n == 0)
            return a[0];
        if (dp[n] != 0)
            return dp[n];

        int start = 0;
        int end = n - 1;
        dp[n] = a[n];
        while (start <= end) {
            int startval = maxProfit(a, start, dp);
            int endval = maxProfit(a, end, dp);
            int profit = startval + endval;
            dp[n] = Math.max(profit, dp[n]);
            start++;
            end--;
        }
        return dp[n];
    }

}
