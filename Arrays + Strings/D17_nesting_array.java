import java.util.*;

class D17_nesting_array {

    public static int arrayNesting(int[] nums) {

        boolean[] visited = new boolean[nums.length];
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            int count = 0;
            while (!visited[j]) {
                visited[j] = true;
                j = nums[j];
                count++;
            }
            ans = Math.max(ans,count);
        }

        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arrayNesting(arr));
    }
}