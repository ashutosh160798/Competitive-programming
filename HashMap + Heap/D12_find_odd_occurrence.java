import java.util.*;

public class D12_find_odd_occurrence {

    // This is a functional problem. You have to complete this function.
    // It takes as input the an array of integers. It should return
    // the number occurring odd number of times.
    public static int solve(int[] arr) {

        int ans = 0;
        for(int i=0;i<arr.length;i++){
            ans = ans^arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solve(arr));

    }

}