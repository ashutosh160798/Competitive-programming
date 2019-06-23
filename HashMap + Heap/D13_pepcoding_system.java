import java.util.*;

public class D13_pepcoding_system {

    // This is a functional problem. You have to complete this function.
    // It takes as input a string array.
    // It should print "Verified" if the username doesn't exists already,
    //else should print the username with a number added to the end of the username.

    private static void solve(String[] str) {
        HashMap<String,Integer>map = new HashMap<>();
        for(String s : str){
            if(!map.containsKey(s)) {
                map.put(s, 1);
                System.out.println("Verified");
            }else {
                System.out.println(s+map.get(s));
                map.put(s, map.get(s)+1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Length of the array
        int N = sc.nextInt();

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        solve(arr);


    }

}