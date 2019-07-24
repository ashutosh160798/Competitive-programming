import java.util.Scanner;

public class D21_rod_cut_tab {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        System.out.println(maxProfit(a, n));

    }

    private static int maxProfit(int[] arr, int n) {

        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            int max = arr[i];
            int start = 0;
            int end = i - 1;
            while (start <= end) {
                max = Math.max(max, dp[start] + dp[end]);
                start++;
                end--;
            }
            dp[i] = max;
        }

        return dp[n - 1];
    }

}
