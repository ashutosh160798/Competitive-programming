import java.util.Scanner;

public class D17_robot_to_origin {

    public static boolean judgeCircle(String s) {

        int vertical = 0, horizontal = 0;
        for (char c : s.toCharArray()) {
            if (c == 'U')
                vertical++;
            else if (c == 'D')
                vertical--;
            else if (c == 'L')
                horizontal--;
            else if (c == 'R')
                horizontal++;
        }
        return vertical == 0 && horizontal == 0;

    }

    // Don't make any changes here.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(judgeCircle(str));

    }
}