import java.util.*;

public class D17_nice_arrangement_v2 {

    // This is a functional problem. You have to complete this function.
    // It takes as input n and k. It should return the resultant array.
    public static int[] constructArray(int n, int k) {

        int [] ans = new int[n];
        for(int i=1;i<n-k;i++){
            ans[i-1] = i;
        }
        boolean flag = false;
        int a = n-k;
        int b = n;
        for(int i = n-k;i<=n;i++){
            if(!flag){
                ans[i-1] = a++;
                flag = true;
            }else {
                ans[i-1] = b--;
                flag = false;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] result = constructArray(N, K);
        if (verify(result, N, K)) {
            System.out.println("Nice Arrangement");
        } else {
            System.out.println("Try Harder");
        }
    }

    // function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // function to verify the result. just ignore it.
    private static boolean verify(int[] arr, int N, int K) {

        if (arr.length < N) {
            return false;
        }

        boolean[] a = new boolean[N + 1];
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (a[arr[i]]) {
                return false;
            } else {
                a[arr[i]] = true;
            }

            if (i == N - 1) {
                break;
            } else {
                if (set.contains(Math.abs(arr[i] - arr[i + 1])) == false) {
                    set.add(Math.abs(arr[i] - arr[i + 1]));
                }
            }

        }

        if (set.size() != K) {
            return false;
        }

        return true;

    }

}