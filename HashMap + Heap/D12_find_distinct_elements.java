import java.util.*;
import java.io.*;

public class D12_find_distinct_elements {

    public static int count(int[][] a) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a[0].length; i++) {
            set.add(a[0][i]);
        }
        for (int i = 1; i < a.length; i++) {
            HashSet<Integer> set1 = new HashSet<>();
            for (int j = 0; j < a[i].length; j++) {
                if (set.contains(a[i][j])) {
                    set1.add(a[i][j]);
                }
            }
            set=set1;
        }
        return set.size();

    }

    //Don't make any changes here
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int i = 0, j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println(count(a));

    }

}