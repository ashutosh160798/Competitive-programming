import java.util.Arrays;
import java.util.Scanner;

public class D15_rotate_array {

    public static void rotate(int[] a, int k) {

        int j = 0;
        int b[] = new int[a.length];
        for (int i = a.length - k; i < a.length; i++) {
            b[j++] = a[i];
        }
        for (int i = 0; i <a.length - k; i++) {
            b[j++] = a[i];
        }
        for(int i=0;i<a.length;i++){
            a[i] = b[i];
        }

    }

    // Don't make any changes here
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        rotate(ar, k);
        for (int v : ar)
            System.out.print(v + " ");
    }

}