import java.util.*;

class D20_majority_element {

    public static int majorityElement(int[] nums) {

        int major = nums[0];
        int count = 1;
        int i = 1;
        while (i < nums.length) {
            if(nums[i]==major){
                count++;
            }else {
                count--;
            }
            if(count==0){
                major = nums[i];
                count++;
            }
            i++;
        }

        count = 0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==major){
                count++;
            }
        }
        if(count>nums.length/2){
            return major;
        }else {
            return -1;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElement(arr));
    }
}