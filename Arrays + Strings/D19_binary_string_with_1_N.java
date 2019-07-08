import java.util.HashSet;
import java.util.Scanner;

class D19_binary_string_with_1_N {
    public static boolean queryString(String S, int N) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = N / 2; i <=N; i++) {
            set.add(i);
        }
        int i = 0;
        int j = 0;
        int num = 0;
        while (i < S.length() && j < S.length()) {
            while (num <= N && i<S.length()) {
                if (S.charAt(i) == '0') {
                    num = num * 2;
                } else {
                    num = num * 2 + 1;
                }
                set.remove(num);
                if(set.size()==0){
                    return true;
                }
                i++;
            }
            while (num>N && j<i){
                if(S.charAt(j)=='1'){
                    double pow = Math.pow(2,i-j-1);
                    num = (int)(num-pow);
                }
                set.remove(num);
                j++;
            }
        }
        return set.isEmpty();
    }

    //Don't make any changes here.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();
        System.out.println(queryString(str, n));

    }

}