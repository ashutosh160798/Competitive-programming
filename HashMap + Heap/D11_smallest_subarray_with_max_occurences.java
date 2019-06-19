import java.util.*;

public class D11_smallest_subarray_with_max_occurences {

    public static void subarrAllOcc(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            max = Math.max(max, map.get(arr[i]));
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i : map.keySet()) {
            if (map.get(i) == max) {
                set.add(i);
            }
        }
        int starti=0;
        int endi=arr.length-1;
        for (int num:set) {
            int start = -1;
            int end = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    start = i;
                    break;
                }
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == num) {
                    end = i;
                    break;
                }
            }
            if(end-start<=endi-starti){
                endi=end;
                starti = start;
            }
        }

        for (int i=starti;i<=endi;i++){
            System.out.print(arr[i]+" ");
        }

    }

    //Dont make changes here
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        subarrAllOcc(arr);
    }
}