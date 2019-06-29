import java.util.*;

public class D16_sort_array_by_parity {

    // This is a functional problem. You have to complete this function.
    // It takes as input an integer array. It should return
    // the required array.
    public static int[] sortArrayByParity(int[] a) {

        int[] ans = new int[a.length];
        int i=0;
        int j=a.length-1;
        for(int k = 0;k<a.length;k++){
            if(a[k]%2==0){
                ans[i++] = a[k];
            }else {
                ans[j--] = a[k];
            }
        }
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

        int[] result = sortArrayByParity(arr);
        int[] sortedResult = sortResultEvenOdd(result);
        display(sortedResult);

    }

    // utility function, don't change the code of it.
    private static int[] sortResultEvenOdd(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] % 2 != 0) {
                Arrays.sort(arr, 0, i);
                Arrays.sort(arr, i, arr.length);
                return arr;
            }
            i++;
        }

        Arrays.sort(arr);
        return arr;

    }

    // function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}