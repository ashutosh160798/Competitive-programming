import java.util.Scanner;

public class D21_longest_inc_subsq_mem {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();

        int max = 0;
        int[] dp =new int[n];
        for (int i=0;i<n;i++){
            max = Math.max(max,lis(a,i,dp));
        }
        System.out.println(max);

    }

    private static int lis(int[] arr, int point, int[] qb) {

        if (point == 0)
            return 1;

        if (qb[point] != 0)
            return qb[point];

        int lisAtpt = 0;
        for (int i = 0; i < point; i++) {
            if (arr[point] > arr[i]) {
                int lisatcurr = lis(arr, i, qb);
                lisAtpt = Math.max(lisAtpt, lisatcurr);
            }
        }
        lisAtpt++;
        qb[point] = lisAtpt;
        return lisAtpt;
    }

}
