import java.util.*;

class D13_jewel_and_stones {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String J = scn.next();
        String S = scn.next();
        System.out.print(numJewelsInStones(J, S));
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input 2 strings.
    // It should return an integer value.
    public static int numJewelsInStones(String J, String S) {

        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(char c : J.toCharArray()){
            set.add(c);
        }
        for (char c : S.toCharArray()){
            if(set.contains(c)){
                count++;
            }
        }
        return count;


    }
}