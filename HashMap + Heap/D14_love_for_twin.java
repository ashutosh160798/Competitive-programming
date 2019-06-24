import java.util.*;

public class D14_love_for_twin {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(mt(arr));
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array.
    // It should return an integer value.
    public static int mt(int[] arr) {

        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Integer i : map.keySet()){
            if(map.get(i)%2==0){
                ans+=map.get(i);
            }else{
                ans=ans+map.get(i)-1;
            }
        }
        return ans;
    }

}