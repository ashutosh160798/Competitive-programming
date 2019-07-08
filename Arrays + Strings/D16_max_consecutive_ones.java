import java.awt.event.MouseAdapter;
import java.util.*;

public class D16_max_consecutive_ones {

    // This is a functional problem. You have to complete this function.
    // It takes as input a binary array. It should return the maximum number
    // of consecutive 1s in this array if you can flip at most one 0.
    public static int findMaxConsecutiveOnes(int[] nums) {

        int ans = 0;
        boolean flipped = false;
        int j = 0;
        int i = 0;
        for (; i < nums.length; i++) {
            if ((nums[i] == 0 && !flipped) || nums[i] == 1) {
                if (nums[i] == 0)
                    flipped = true;
                continue;
            }
            ans = Math.max(ans, i - j);
            while (j < i && nums[j++] != 0 && flipped) {
            }
            flipped = false;
        }
        ans = Math.max(ans, i - j);
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

        int result = findMaxConsecutiveOnes(arr1);

        System.out.println(result);

    }

    // Function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}