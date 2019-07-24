import java.util.Scanner;

public class D22_coin_change_perm_mem {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int target = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        System.out.println(permutations(a, target, new int[target + 1]));
    }

    private static int permutations(int[] denominations, int target, int[] dp) {

        if (target < 0) {
            return 0;
        }
        if (dp[target] != 0) {
            return dp[target];
        }
        if (target == 0) {
            return 1;
        }
        int ways = 0;
        for (int denomination : denominations) {
            ways += permutations(denominations, target - denomination, dp);
        }
        dp[target] = ways;
        return ways;
    }
}
