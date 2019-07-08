import java.util.*;

public class D18_best_sightseeing_pair {

    // This is a functional problem. You have to complete this function.
    // It takes as input an integer array. It should return the maximum
    // score of a pair.
    public static int maxScoreSightseeingPair(int[] A) {

        int score = A[0];
        int max = Integer.MIN_VALUE;

        for(int i=1;i<A.length;i++){
            score--;
            max = Math.max(max,A[i]+score);
            score = Math.max(score,A[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxScoreSightseeingPair(arr));

    }

    // function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}