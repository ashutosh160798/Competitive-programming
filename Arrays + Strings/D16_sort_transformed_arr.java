import java.util.*;

public class D16_sort_transformed_arr {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }
        Arrays.sort(nums);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int[] res = sortTransformedArray(nums, a, b, c);
        for (int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
    }
    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array and 3 integers
    // It should return an integeral array

    public static int[] sortTransformedArray(int[] nums, int a, int b, int c) {

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            ans[i] = (a * (int) Math.pow(x, 2)) + (b * x) + c;
        }
        Arrays.sort(ans);
        return ans;

    }
}