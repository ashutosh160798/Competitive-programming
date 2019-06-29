import java.util.*;

public class D17_container_with_most_water {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = scn.nextInt();
        }
        System.out.print(maxArea(height));
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array of heights
    // It should return required output.

    public static int maxArea(int[] height) {

        int i = 0;
        int j = height.length - 1;
        int ans = 0;
        while (i < j) {
            if(height[i]<j){
                ans = Math.max((j-i)*height[i++],ans);
            }
            else
                ans = Math.max((j-i)*height[j--],ans);
        }
        return ans;
    }
}