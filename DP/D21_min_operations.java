import java.util.Scanner;

public class D21_min_operations {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        minOperations(n);
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an integer
    // It should print the required output

    static void minOperations(int n) {
        int steps = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                n--;
            } else {
                n /= 2;
            }
            steps++;
        }

        System.out.print(steps);

    }
}