import java.util.*;

public class D21_min_deletion_to_make_sorted {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        mindeletions(a, n);
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array and its length
    // It should print the required output

    static void mindeletions(int[] a, int n) {

        System.out.println(a.length-lis(a));

    }

    public static int lis(int[] arr) {

        int[] helper = new int[arr.length];
        helper[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                    max = Math.max(max,helper[j]);
                }
            }
            helper[i] = max+1;
        }
        int ans = -1;
        for(int i=0;i<helper.length;i++){
            ans = Math.max(ans,helper[i]);
        }

        return ans;

    }

}