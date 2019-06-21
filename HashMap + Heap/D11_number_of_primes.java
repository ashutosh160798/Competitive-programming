import java.util.*;

public class D11_number_of_primes {

    // This is a functional problem. You have to complete this function.
    // It takes as input N. It should return the count of prime numbers less
    // than N.
    public static int countPrimes(int n) {

        boolean[] arr = new boolean[n];
        arr[0]=true;
        arr[1]=true;
        for(int i=2;i<Math.sqrt(n);i++){
            if(!arr[i]){
                for(int j=2*i;j<n;j=j+i){
                    arr[j]=true;
                }
            }
        }
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(!arr[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(countPrimes(N));

    }

}