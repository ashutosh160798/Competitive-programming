import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CC_DSTAPLS {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            String[] nums = br.readLine().split(" ");
            System.out.println(apples(Long.parseLong(nums[0]), Long.parseLong(nums[1])));
        }
    }

    private static String apples(long a, long b) {

        if (a == 0 || b <= 1) {
            return "NO";
        }
        if (a < 0) {
            return "YES";
        }
        while (true) {
            a = a - (b * b);
            if (a == 0) {
                return "NO";
            }
            if (a < 0) {
                return "YES";
            }
        }
    }
}
