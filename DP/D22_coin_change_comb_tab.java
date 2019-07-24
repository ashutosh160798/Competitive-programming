import java.util.ArrayList;
import java.util.Scanner;

public class D22_coin_change_comb_tab {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int target = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        combinations(a, target);
    }

    private static void combinations(int[] arr, int target) {

        int[] dp = new int[target + 1];
        dp[0] = 1;
        ArrayList<String>[] arrayList = new ArrayList[target + 1];
        arrayList[0] = new ArrayList<>();
        arrayList[0].add("");
        for (int i = 0; i < arr.length; i++) {
            int coin = arr[i];
            for (int j = coin; j <=target; j++){
                dp[j] += dp[j-coin];
                if(arrayList[j]==null){
                    arrayList[j] = new ArrayList<>();
                }
                if(arrayList[j-coin]!=null){
                    for(String str : arrayList[j-coin])
                        arrayList[j].add(str+coin);
                }
            }
        }
        System.out.println(dp[target]+" combinations:");
        for (String s:arrayList[target])
            System.out.println(s);
    }


}
