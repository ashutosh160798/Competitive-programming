import java.util.Scanner;

public class D20_jump_game {
    private static int jump(int[] nums) {

        int [] arr = new int[nums.length];
        arr[nums.length-1]=0;
        for (int i=nums.length-2;i>=0;i--){
            if(nums[i]==0){
                arr[i] = nums.length;
                continue;
            }
            int min = Integer.MAX_VALUE;
            for(int j=1;j<=nums[i]&&j+i<arr.length;j++){
                min = Math.min(min,arr[j+i]);
            }
            arr[i] = min+1;
        }
        return arr[0];
    }

    //Don't male any changes here
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = s.nextInt();
        }
        System.out.println(jump(num));
    }

}