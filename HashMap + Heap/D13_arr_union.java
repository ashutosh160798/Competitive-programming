import java.util.*;

public class D13_arr_union {

    // This is a functional problem. You have to complete this function.
    // It takes as input two array.
    // It should return list of k lists of pairs with smallest sum.
    public static int[] union(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for (int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        int[] ans = new int[set.size()];
        Iterator<Integer> itr= set.iterator();
        for(int i=0;i<set.size();i++){
            ans[i] = itr.next();
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for length of first array.
        int N = sc.nextInt();

        int[] arr1 = new int[N];

        // Input for array1 elements.
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input for length of second array.
        int M = sc.nextInt();

        int[] arr2 = new int[M];

        // Input for array2 elements.
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] result = union(arr1, arr2);

        Arrays.sort(result);
        display(result);

    }

    // Function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}