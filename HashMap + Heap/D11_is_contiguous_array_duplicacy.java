import java.util.*;
import java.io.*;

public class D11_is_contiguous_array_duplicacy {

    public static boolean isContiguous(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        Integer[] array = set.toArray(new Integer[set.size()]);
        Arrays.sort(array);
        for(int i=0;i<array.length-1;i++){
            if(array[i]+1!=array[i+1]){
                return false;
            }
        }
        return true;
    }

    //Don't make changes here
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(s[i]);
        }
        boolean bl = isContiguous(num);
        System.out.println(bl);
    }
}