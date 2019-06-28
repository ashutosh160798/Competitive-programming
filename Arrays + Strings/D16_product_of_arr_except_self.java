import java.util.Scanner;

public class D16_product_of_arr_except_self {
    public static int[] productExceptSelf(int[] nums) {

        int pro = 1;
        for(int i=0; i<nums.length;i++){
            pro*=nums[i];
        }
        int[] ans = new int[nums.length];
        for(int i=0;i<ans.length;i++){
            ans[i] = pro/nums[i];
        }
        return ans;

    }

    //Don't make changes here.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int Input[] = new int[n];
        for (int i = 0; i < n; i++) {
            Input[i] = scn.nextInt();
        }
        int ans[] = productExceptSelf(Input);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

}