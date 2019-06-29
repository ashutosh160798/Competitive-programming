import java.util.*;
class D10_find_triplet_with_sum_0
{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.print(findTriplets(arr,n));
    }
    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array and n length of array.
    // It should return a boolean value.
    public static boolean findTriplets(int nums[] , int n)
    {
        Arrays.sort(nums);
        HashSet<List<Integer>> ans = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            int num = -nums[i];
            while (j<k){
                if(nums[j]+nums[k]==num){

                    return true;

                }else if(nums[j]+nums[k]<num){
                    j++;
                }else {
                    k--;
                }
            }
        }
        return false;
    }
}