import java.util.*;
class D13_keyboard_row {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        String[] words= new String[n];
        for(int i=0;i<n;i++)
            words[i]=scn.next();
        String[] res= findWords(words);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array of string.
    // It should return an array of suitable strings.

    public static String[] findWords(String[] words) {

        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        ArrayList<String> al = new ArrayList<>();
        for(String word : words){
            HashSet<Integer> set = new HashSet<>();
            for(char c : word.toCharArray()){
                if(s1.contains(c+""))
                    set.add(0);
                else if (s2.contains(c+""))
                    set.add(1);
                else if (s3.contains(c+""))
                    set.add(2);
            }
            if(set.size()==1){
                al.add(word);
            }
        }
        return al.toArray(new String[al.size()]);
    }
}