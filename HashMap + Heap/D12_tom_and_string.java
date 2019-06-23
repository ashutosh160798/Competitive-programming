import java.util.*;

public class D12_tom_and_string {

    public static int getHashValue(String line) {
        String string = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] arr = line.split(" ");
        int hash = 0;
        for(int i=0;i<arr.length;i++){
            String s = arr[i];
            for(int j=0;j<s.length();j++){
                hash = hash+j+string.indexOf(s.charAt(j));
            }
        }
        hash*=arr.length;
        return hash;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine();
        System.out.println(getHashValue(line));

    }

}