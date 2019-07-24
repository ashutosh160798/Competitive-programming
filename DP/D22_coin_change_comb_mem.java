import java.util.ArrayList;
import java.util.Scanner;

public class D22_coin_change_comb_mem {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int target = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        System.out.println(permutations(a, target, new ArrayList[target + 1]));
    }

    private static ArrayList<String> permutations(int[] denominations, int target, ArrayList<String>[] dp) {

        if (target < 0) {
            return new ArrayList<>();
        }
        if (dp[target] != null) {
            return dp[target];
        }
        if (target == 0) {
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            return al;
        }
        ArrayList<String> paths = new ArrayList<>();
        for (int denomination : denominations) {
            ArrayList<String> curr = permutations(denominations, target - denomination, dp);
            for (String str : curr){
                paths.add(str+denomination);
            }
        }
        dp[target] = paths;
        return paths;
    }

}
