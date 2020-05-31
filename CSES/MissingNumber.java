import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int arr[] = new int[a-1];
        for(int i = 0;i<a-1;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(miss(a,arr));
    }

    private static int miss(int size, int[] arr) {
        boolean[] temp = new boolean[size];
        for(int i:arr){
            temp[i-1] = true;
        }
        int ans = -1;
        for (int i=0;i<size;i++){
            if(!temp[i]){
                ans = i;
            }
        }
        return ans+1;
    }
}
