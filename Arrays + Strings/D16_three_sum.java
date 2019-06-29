import java.util.*;

class D16_three_sum{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scn.nextInt();
        }
        System.out.print(threeSum(nums));
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array
    // It should return an required output
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> ans = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            int num = -nums[i];
            while (j<k){
                if(nums[j]+nums[k]==num){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    j++;
                    k--;
                }else if(nums[j]+nums[k]<num){
                    j++;
                }else {
                    k--;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}