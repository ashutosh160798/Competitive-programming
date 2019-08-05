import java.util.Scanner;

public class CC_CHFM {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int n = 0;
        if (s.hasNextInt())
            n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int j = s.nextInt();
            int[] arr = new int[j];
            for (int k = 0; k < j; k++) {
                arr[k] = s.nextInt();
            }
            System.out.println(CHFM(arr));
        }

    }

    public static String CHFM(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double d = (double) sum / arr.length;
        if (d % 1 != 0) {
            return "Impossible";
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sum / arr.length) {
                return i + 1 + "";
            }
        }
        return "Impossible";
    }

}
