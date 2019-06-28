import java.util.Scanner;

public class D16_plus_1 {
    public static int[] plusOne(int[] digits) {
        int ans[] = new int[digits.length];
        if (digits[0] == 0) {
            ans[0] = 1;
            return ans;
        }
        boolean carry = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (carry) {
                int a = digits[i] + 1;
                ans[i] = a % 10;
                if(a/10==0){
                    carry=false;
                }
            }else {
                ans[i] = digits[i];
            }
        }
        if(carry){
            int [] ans1 = new int[ans.length+1];
            ans1[0]=1;
            for(int i=1;i<ans1.length;i++){
                ans1[i] = ans[i-1];
            }
            ans = ans1;
        }

        return ans;
    }

    //Don't make any changes here.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] Input = new int[n];
        for (int i = 0; i < Input.length; i++) {
            Input[i] = scn.nextInt();
        }
        int ans[] = plusOne(Input);
        for (int i : ans) {
            System.out.print(i + " ");
        }

    }

}