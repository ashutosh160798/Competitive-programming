import java.lang.*;
import java.io.*;
import java.util.*;

class D14_largest_fib_subsequence {

    public static void solve(int[] arr) {

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        set.add(1);
        int num1 = 1;
        int num2 = 1;
        while(num1+num2<=max){
            int temp = num2;
            num2 = num1+num2;
            num1 = temp;
            set.add(num2);
        }
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(s[i]);
        }
        solve(num);
    }

}