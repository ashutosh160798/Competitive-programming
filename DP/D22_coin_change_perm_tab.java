import java.util.ArrayList;
import java.util.Scanner;

public class D22_coin_change_perm_tab {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int target = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        permutations(a, target);
    }

    private static void permutations(int[] arr, int target) {

        int[] dp = new int[target + 1];
        dp[0] = 1;
        ArrayList<String>[] arrayList = new ArrayList[target + 1];
        arrayList[0] = new ArrayList<>();
        arrayList[0].add("");

        for (int j = 0; j <= target; j++) {
            for (int i = 0; i < arr.length; i++) {
                int coin = arr[i];
                if(j-coin<0)
                    continue;
                dp[j] += dp[j - coin];
                if (arrayList[j] == null) {
                    arrayList[j] = new ArrayList<>();
                }
                if (arrayList[j - coin] != null) {
                    for (String str : arrayList[j - coin])
                        arrayList[j].add(str + coin);
                }
            }
        }
        System.out.println(dp[target] + "permutations:");
        for (String s : arrayList[target])
            System.out.println(s);
    }

    
}
