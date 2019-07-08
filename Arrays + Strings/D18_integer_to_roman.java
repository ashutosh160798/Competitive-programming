import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class D18_integer_to_roman {
    public static String intToRoman(int num) {

        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");

        Integer[] arr = map.keySet().toArray(new Integer[map.size()]);
        String ans = "";
        int i = arr.length-1;
        while (num>0){
            if(num>=arr[i]){
                ans += map.get(arr[i]);
                if(arr[i]==1){
                    num--;
                }else{
                    num -= arr[i];
                }
            }else {
                i--;
            }
        }

        return ans;

    }


    //Don't make any changes here
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(intToRoman(num));

    }

}