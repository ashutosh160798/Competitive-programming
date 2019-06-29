import java.util.*;

public class D17_buy_sell_stocks {

    // This is a functional problem. You have to complete this function.
    // It takes as input an integer array. It should return the maximum profit.
    public static int maxProfit(int[] A) {
        int ans = 0;
        boolean buy = false;

        for (int i = 0; i < A.length - 1; i++) {
            if(A[i]<=A[i+1]&&!buy){
                ans-= A[i];
                buy = true;
            }else if (A[i]>A[i+1]&&buy){
                ans+=A[i];
                buy = false;
            }
        }
        if(buy){
            ans+=A[A.length-1];
        }
        return ans;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxProfit(arr));
    }

    // function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}