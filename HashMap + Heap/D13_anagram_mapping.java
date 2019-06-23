import java.util.*;

public class D13_anagram_mapping {

    public static int[] anagramMappings(int[] A, int[] B) {

        int[] P = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    P[i] = j;
                    break;
                }
            }
        }
        return P;

    }

    //Don't make any changes here
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        for (int j = 0; j < b.length; j++) {
            b[j] = s.nextInt();
        }
        int[] res = anagramMappings(a, b);
        for (int j = 0; j < res.length; j++) {
            System.out.print(res[j] + " ");
        }

    }

}