import java.util.*;

public class D14_unique_nums {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int l = scn.nextInt();
        int r = scn.nextInt();
        numners(l, r);
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input two numbers as range
    // It should print required output

    public static void numners(int l, int r) {
        for (int i = l; i <= r; i++) {
            HashSet<Integer> map = new HashSet<>();
            int x = i;
            boolean flag = false;
            while (x > 0) {
                if (map.contains(x%10)) {
                    x = x / 10;
                    flag = true;
                    break;
                } else {
                    map.add(x%10);
                    x = x / 10;
                }
            }
            map.clear();
            if (flag) {
                continue;
            }
            System.out.print(i + " ");
        }

    }
}