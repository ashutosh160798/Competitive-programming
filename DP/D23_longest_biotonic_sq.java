import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class D23_longest_biotonic_sq {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();

        System.out.print(lbs(a));

    }

    private static int lbs(int[] a) {

        int[] lisOfa = lis(a);
        Collections.reverse(Arrays.asList(a));
        int[] lisOfreva = lis(a);
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < lisOfa.length; i++) {
            ans = Math.max(ans, lisOfa[i] + lisOfreva[a.length - i - 1] - 1);
        }
        return ans;
    }

    private static int[] lis(int[] arr) {

        int[] helper = new int[arr.length];
        helper[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    max = Math.max(max, helper[j]);
                }
            }
            helper[i] = max + 1;
        }

        return helper;

    }

}
