import java.util.Scanner;

public class D21_count_board_tab {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int src = s.nextInt();
        int dest = s.nextInt();
        System.out.println(count(src, dest, new int[dest + 1]));

    }

    private static int count(int src, int dest, int[] dp) {
        if(src>dest)
            return 0;
        dp[dest] = 1;
        for (int i = dest - 1; i >= src; i--) {
            for (int j=1;j<=6;j++){
                int step = i+j;
                if(i+j>dest)
                    continue;
                dp[i]+=dp[step];
            }
        }
        return dp[src];

    }

}
