import java.util.*;

public class D15_next_closest_time {

    // This is a functional problem. You have to complete this function.
    // It takes as input a string representing a time.
    // It should return the next closest time.
    public static String nextClosestTime(String t) {

        //TODO:reattempt
        int hours = Integer.parseInt(t.substring(0,2));
        int mins = Integer.parseInt(t.substring(3));
        HashSet<Integer> set = new HashSet<>();
        for(char c : t.toCharArray()){
            if(c==':')
                continue;
            set.add(Integer.parseInt(c+""));
        }
        int [] elements = new int[set.size()];
        Iterator itr = set.iterator();
        int i=0;
        while (itr.hasNext()){
            elements[i++] = (int)itr.next();
        }
        Arrays.sort(elements);




        return "";

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        System.out.println(nextClosestTime(time));

    }
}