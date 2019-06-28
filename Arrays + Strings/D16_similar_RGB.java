import java.util.*;

public class D16_similar_RGB {

    public static String similarRGB(String color) {

        String R = color.substring(1, 3);
        String G = color.substring(3, 5);
        String B = color.substring(5, 7);
        String ans = "#";

        if(R.substring(0,1).equals(R.substring(1,2))){
            ans = ans +  R;
        }
        else if (Integer.parseInt(R.substring(0, 1), 16) < Integer.parseInt(R.substring(1, 2), 16)) {

            if (Integer.parseInt(R, 16) - Integer.parseInt(R.substring(0, 1) + R.substring(0, 1), 16)
                    >
                    Integer.parseInt(R, 16) -
                    Integer.parseInt((Integer.toHexString(Integer.parseInt(R.substring(0, 1), 16) + 1)) +
                    "" + Integer.toHexString(Integer.parseInt(R.substring(0, 1), 16) + 1),16)) {

                ans = ans+R.substring(0,1)+R.substring(0,1);

            }
            else {
                ans += (Integer.toHexString(Integer.parseInt(R.substring(0, 1), 16) + 1)) +
                        "" + Integer.toHexString(Integer.parseInt(R.substring(0, 1), 16) + 1);
            }
        }else{
            if ((Integer.parseInt(R, 16) - Integer.parseInt(R.substring(0, 1) + R.substring(0, 1), 16))
                    >
                    (Integer.parseInt(R, 16) -
                            Integer.parseInt((Integer.toHexString(Integer.parseInt(R.substring(0, 1), 16) - 1)) +
                                    "" + Integer.toHexString(Integer.parseInt(R.substring(0, 1), 16) - 1)))) {

                ans = ans+R.substring(0,1)+R.substring(0,1);

            }
            else {
                ans += (Integer.toHexString(Integer.parseInt(R.substring(0, 1), 16) - 1)) +
                        "" + Integer.toHexString(Integer.parseInt(R.substring(0, 1), 16) - 1);
            }
        }


        if(G.substring(0,1).equals(G.substring(1,2))){
            ans = ans +  G;
        }
        else if (Integer.parseInt(G.substring(0, 1), 16) < Integer.parseInt(G.substring(1, 2), 16)) {

            if (Integer.parseInt(G, 16) - Integer.parseInt(G.substring(0, 1) + G.substring(0, 1), 16)
                    >
                    Integer.parseInt(G, 16) -
                            Integer.parseInt((Integer.toHexString(Integer.parseInt(G.substring(0, 1), 16) + 1)) +
                                    "" + Integer.toHexString(Integer.parseInt(G.substring(0, 1), 16) + 1), 16)) {

                ans = ans+G.substring(0,1)+G.substring(0,1);

            }
            else {
                ans += (Integer.toHexString(Integer.parseInt(G.substring(0, 1), 16) + 1)) +
                        "" + Integer.toHexString(Integer.parseInt(G.substring(0, 1), 16) + 1);
            }
        }else{
            if ((Integer.parseInt(G, 16) - Integer.parseInt(G.substring(0, 1) + G.substring(0, 1), 16))
                    >
                    (Integer.parseInt(G, 16) -
                            Integer.parseInt(((Integer.toHexString(Integer.parseInt(G.substring(0, 1), 16) - 1)) +
                                     Integer.toHexString(Integer.parseInt(G.substring(0, 1), 16) - 1)),16))) {

                ans = ans+G.substring(0,1)+G.substring(0,1);

            }
            else {
                ans += (Integer.toHexString(Integer.parseInt(G.substring(0, 1), 16) - 1)) +
                        "" + Integer.toHexString(Integer.parseInt(G.substring(0, 1), 16) - 1);
            }
        }

        if(B.substring(0,1).equals(B.substring(1,2))){
            ans = ans +  B;
        }
        else if (Integer.parseInt(B.substring(0, 1), 16) < Integer.parseInt(B.substring(1, 2), 16)) {

            if (Integer.parseInt(B, 16) - Integer.parseInt(B.substring(0, 1) + B.substring(0, 1), 16)
                    >
                    Integer.parseInt(B, 16) -
                            Integer.parseInt((Integer.toHexString(Integer.parseInt(B.substring(0, 1), 16) + 1)) +
                                    "" + Integer.toHexString(Integer.parseInt(B.substring(0, 1), 16) + 1),16)) {

                ans = ans+B.substring(0,1)+B.substring(0,1);

            }
            else {
                ans += (Integer.toHexString(Integer.parseInt(B.substring(0, 1), 16) + 1)) +
                        "" + Integer.toHexString(Integer.parseInt(B.substring(0, 1), 16) + 1);
            }
        }else{
            if ((Integer.parseInt(B, 16) - Integer.parseInt(B.substring(0, 1) + B.substring(0, 1), 16))
                    >
                    (Integer.parseInt(B, 16) -
                            Integer.parseInt((Integer.toHexString(Integer.parseInt(B.substring(0, 1), 16) - 1)) +
                                    "" + Integer.toHexString(Integer.parseInt(B.substring(0, 1), 16) - 1),16))) {

                ans = ans+B.substring(0,1)+B.substring(0,1);

            }
            else {
                ans += (Integer.toHexString(Integer.parseInt(B.substring(0, 1), 16) - 1)) +
                        "" + Integer.toHexString(Integer.parseInt(B.substring(0, 1), 16) - 1);
            }
        }

        return ans;





    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(similarRGB(sc.next()));
    }

}