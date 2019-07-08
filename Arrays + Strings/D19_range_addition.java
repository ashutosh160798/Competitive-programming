import java.util.*;

public class D19_range_addition {

    // This is a functional problem. You have to complete this function.
    // It takes as input a length and a 2D array of update operations.
    // It should return the modified array.
    public static int[] getModifiedArray(int length, int[][] updates) {

        int [] ans = new int[length+1];
        for (int i=0;i<updates.length;i++){
            int startIndex = updates[i][0];
            int endIndex = updates[i][1];
            int inc = updates[i][2];

            ans[startIndex] += inc;
            ans[endIndex+1] -= inc;

        }
        int sum = 0;
        for (int i=0;i<ans.length;i++){
            int x = ans[i];
            ans[i] += sum;
            sum += x;
        }
        return Arrays.copyOfRange(ans,0,ans.length-1);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for length of first array.
        int length = sc.nextInt();

        int K = sc.nextInt();

        int[][] updates = new int[K][3];

        for (int i = 0; i < updates.length; i++) {
            for (int j = 0; j < updates[0].length; j++) {
                updates[i][j] = sc.nextInt();
            }
        }

        int[] result = getModifiedArray(length, updates);
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