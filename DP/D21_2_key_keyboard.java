import java.util.*;
public class D21_2_key_keyboard {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(_2KeysKeyboard(n));
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an integer
    // It should return the required output

    public static int _2KeysKeyboard(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                n = n / i;
            }
        }
        if (n > 2) {
            map.put(n, 1);
        }
        int ans = 0;
        for (int key : map.keySet()) {
            ans += key*map.get(key);
        }
        return ans;
    }
}