import java.io.IOException;
import java.util.Scanner;

public class max_subarr_sum {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the maximumSum function below.
    private static long maximumSum(long[] a, long m) {

        long max = Integer.MIN_VALUE;
        long[][] dp = new long[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            dp[i][i] = a[i];
            max = Math.max(max, a[i] % m);
        }
        for (int gap = 1; gap < a.length; gap++) {
            for (int i = 0, j = i + gap; j < a.length; i++, j++) {
                dp[i][j] = dp[i][j - 1] + dp[i + 1][j];
                max = Math.max(max, dp[i][j] % m);
            }
        }

        return max;
    }

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            long m = Long.parseLong(nm[1]);

            long[] a = new long[n];

            String[] aItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                long aItem = Long.parseLong(aItems[i]);
                a[i] = aItem;
            }

            long result = maximumSum(a, m);
            System.out.println(result);

        }


        scanner.close();
    }
}
