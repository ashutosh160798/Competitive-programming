import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class IncArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); //Length of Array
        String s= br.readLine(); //Input the number seperated by space
        int[] arr= new int[num];
        String[] s1 = s.split(" ");
        for(int i=0;i<num;i++)
        {
            arr[i]=Integer.parseInt(s1[i]);
        }
        System.out.println(incArr(arr));
    }

    private static BigInteger incArr(int[] arr) {
        BigInteger ans = BigInteger.ZERO;
        int prev = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<prev) {
                ans = ans.add(new BigInteger((prev - arr[i])+""));
                arr[i] = prev;
            }
            prev = arr[i];
        }

        return ans;
    }
}
