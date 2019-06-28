import java.util.*;

public class D16_sq_of_sorted_arr {

    // This is a functional problem. You have to complete this function.
    // It takes as input an integer array. It should return
    // the required array.
    public static int[] sortedSquares(int[] A) {

        int [] ans = new int[A.length];
        int i=0;
        int j=A.length-1;
        int index = A.length-1;
        while (i!=j){
            if(Math.pow(A[i],2)>Math.pow(A[j],2)){
                ans[index--] = (int)Math.pow(A[i],2);
                i++;
            }else {
                ans[index--] = (int)Math.pow(A[j],2);
                j--;
            }
        }
        ans[0] = (int)Math.pow(A[i],2);
        return ans;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for length of array.
        int length = sc.nextInt();

        int[] arr = new int[length];

        // Input for elements of array.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = sortedSquares(arr);
        display(result);

    }

    // function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}