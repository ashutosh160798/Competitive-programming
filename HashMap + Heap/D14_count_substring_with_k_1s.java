import java.io.*;
import java.util.*;

public class D14_count_substring_with_k_1s {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        int K = scn.nextInt();

        System.out.println(
                countOfSubstringWithKOnes(s, K));
    }
    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input a string and an integer k.
    // It should return required integer value.

    static int countOfSubstringWithKOnes(String s, int k) {

        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefetch = 0;
        map.put(0, 1);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            prefetch+=arr[i];
            if(map.containsKey(prefetch - k)){
                count += map.get(prefetch-k);
            }
            map.put(prefetch,map.getOrDefault(prefetch,0)+1);
        }
        return count;


    }

}