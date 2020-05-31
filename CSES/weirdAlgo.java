import java.math.BigInteger;
import java.util.*;

public class weirdAlgo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        weird(a);

    }

    public static void weird(int num) {
        BigInteger a = BigInteger.valueOf(num);
        while (a.compareTo(BigInteger.ONE) != 0) {
            System.out.print(a + " ");
            if (a.mod(BigInteger.TWO).compareTo(BigInteger.ZERO) == 0) {
                a = a.divide(BigInteger.TWO);
            } else {
                a = (a.multiply(BigInteger.valueOf(3))).add(BigInteger.ONE);
            }
        }
        System.out.print(1);
    }


}