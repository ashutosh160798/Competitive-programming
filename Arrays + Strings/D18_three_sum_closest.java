import java.util.*;

class D18_three_sum_closest {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        System.out.print(threeSumClosest(nums,k));
    }
    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array and an integer
    // It should return an integer value.

    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            int num = nums[i];
            while (j<k){
                if(min>Math.abs(nums[j]+nums[k]+num-target)){
                    min = Math.abs(nums[j]+nums[k]+num-target);
                    ans = nums[j]+nums[k]+num;
                }
                if(Math.abs(nums[j]+nums[k]+num-target)==0){
                    return ans;
                }else if(nums[j]+nums[k]<num){
                    j++;
                }else {
                    k--;
                }
            }
        }
        return ans;

    }
}