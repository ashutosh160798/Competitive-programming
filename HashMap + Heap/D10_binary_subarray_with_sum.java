import java.util.*;

public class D10_binary_subarray_with_sum {

    // This is a functional problem. You have to complete this function.
    // It takes as input an array A and a sum S.
    // You have to return the number of subarrays with sum S.

    public static int numSubarraysWithSum(int[] arr, int sum) {

        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefetchsum=0;
        for (int i=0;i<arr.length;i++) {
            prefetchsum += arr[i];
            if (map.containsKey(prefetchsum - sum)) {
                count += map.get(prefetchsum - sum);
            }
            map.put(prefetchsum, map.getOrDefault(prefetchsum, 0) + 1);

        }
        return count;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input for the array.
        int N = sc.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            array[i] = n;
        }

        // Taking input for sum.
        int sum = sc.nextInt();

        System.out.println(numSubarraysWithSum(array, sum));

    }

    // Function to print an array. You can use it for debugging purposes.
    // It takes as input the array to be displayed.
    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}