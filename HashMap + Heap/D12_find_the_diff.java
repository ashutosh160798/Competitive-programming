    import java.util.*;

    public class D12_find_the_diff {

        // This is a functional problem. You have to complete this function.
        // It takes as input the String s ant t. It should return the different
        // character.
        public static char findTheDifference(String s, String t) {
            int a = 0;
            for(char c:s.toCharArray()){
                a = c^a;
            }
            for (char c : t.toCharArray()){
                a=c^a;
            }
            return (char) a;

        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String t = sc.next();
            System.out.println(findTheDifference(s, t));

        }

    }