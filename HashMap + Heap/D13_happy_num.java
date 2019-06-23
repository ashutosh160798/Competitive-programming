import java.util.*;

public class D13_happy_num {

    // This is a functional problem. You have to complete this function.
    // It takes as input a number n. It should return true if the number is
    // happy, else should return false.
    public static boolean isHappy(int n) {

        HashSet<Integer>set = new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            int num=0;
            while(n>0){
                num+=Math.pow(n%10,2);
                n=n/10;
            }
            n=num;
        }
        return set.contains(1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (isHappy(N)) {
            System.out.println("Happy");
        } else {
            System.out.println("Not Happy");
        }
    }

}