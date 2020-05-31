import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        System.out.println(rep(a.toCharArray()));
    }

    private static int rep(char[] a) {
        int ans = 0;
        char prev = a[0];
        int temp = 1;
        for (int i = 1; i < a.length; i++) {
            if(a[i]==prev){
                temp++;
            }else {
                ans = Math.max(ans,temp);
                temp = 1;
                prev = a[i];
            }

        }

        return Math.max(ans,temp);
    }
}
