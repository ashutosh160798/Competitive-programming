import java.util.*;

class D19_ambiguous_coordinates {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        List<String> res = ambiguousCoordinates(s);
        System.out.print(res);
    }

    // -----------------------------------------------------
    // This is a functional problem. Do not modify main
    // This function takes as input an array and integer k.
    // It should return required output.

    public static List<String> ambiguousCoordinates(String S) {

        List<String> ans = new ArrayList<>();

        for (int i=1;i<S.length();i++){

            String numerator = S.substring(0,i);
            String denominator = S.substring(i);

            ArrayList<String> nums = getDec(numerator);
            ArrayList<String> dens = getDec(denominator);
            if(nums.size()==0||dens.size()==0){
                continue;
            }
            for (int j=0;j<nums.size();j++){
                for(int k = 0;k<dens.size();k++){
                    ans.add("("+nums.get(j)+", "+dens.get(k)+")");
                }
            }

        }
        return ans;


    }

    private static ArrayList<String> getDec(String s) {
        ArrayList<String> res = new ArrayList<>();
        if(s.charAt(0)=='0'&&s.charAt(s.length()-1)=='0'){
            return res;
        }
        if(s.charAt(0)=='0'){
            res.add("0."+s.substring(1));
            return res;
        }
        if(s.charAt(s.length()-1)=='0'){
            res.add(s.substring(0,s.length()-1)+".0");
            return res;
        }
        if(s.length()==1){
            res.add(s);
            return res;
        }
        for (int i=1;i<s.length();i++){
            res.add(s.substring(0,i)+"."+s.substring(i));
        }
        res.add(s);
        return res;
    }
}