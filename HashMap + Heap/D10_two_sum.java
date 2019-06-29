import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class D10_two_sum {


    public static class Pair implements Comparable<Pair>{
        int val;
        int index;

        public Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }


        @Override
        public int compareTo(Pair o) {
            return this.val-o.val;
        }
    }

    public static ArrayList<Integer> twoSum(ArrayList<Integer> nums, int target) {

        ArrayList<Integer> ans = new ArrayList<>();
        Pair[] arr = new Pair[nums.size()];
        for(int i=0;i<nums.size();i++){
            arr[i] = new Pair(nums.get(i),i);
        }
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while (i<j){
            if(arr[i].val+arr[j].val==target){
                if(arr[i].index<arr[j].index){
                    ans.add(arr[i].index);
                    ans.add(arr[j].index);
                }else {
                    ans.add(arr[j].index);
                    ans.add(arr[i].index);
                }

                return ans;
            }
            if(arr[i].val+arr[j].val>target){
                j--;
            }else {
                i++;
            }

        }

        return ans;
    }

    //Don't make any changes here.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            nums.add(s.nextInt());
        }
        int target = s.nextInt();
        System.out.println(twoSum(nums, target));

    }


}