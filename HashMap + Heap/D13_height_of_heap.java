import java.util.*;
import java.lang.*;
import java.io.*;

class D13_height_of_heap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int x = solve(n);
        System.out.println(x);
    }
    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array and n length of array.
    // It should return an integer value.

    private static int solve(int N) {
        int x = 0;
        while ((x << 1) < N) {
            x++;
        }
        return x;

    }


}