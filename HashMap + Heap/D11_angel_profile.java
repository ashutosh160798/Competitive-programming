import java.util.*;
import java.io.*;

public class D11_angel_profile {

    public static void findIfFake(String s) {

        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            String vowels = "aeiou";
            if (!vowels.contains(c + "")) {
                set.add(c);
            }
        }
        if(set.size()%2==0){
            System.out.println("SHE!");
        }else {
            System.out.println("HE!");
        }

    }

    //Don't make any changes here
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        findIfFake(br.readLine());
    }
}