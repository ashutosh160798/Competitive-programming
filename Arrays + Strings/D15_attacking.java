import java.util.*;

class D15_attacking {

    public static int findPoisonedDuration(int[] timeSeries, int duration) {

        int attack = 0;
        int start = timeSeries[0];
        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i + 1] - timeSeries[i] < duration) {
                continue;
            }
            attack = attack + timeSeries[i] - start + duration;
            start = timeSeries[i + 1];
        }
        attack = attack + timeSeries[timeSeries.length-1] - start + duration;

        return attack;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] timeseries = new int[n];
        for (int i = 0; i < n; i++) {
            timeseries[i] = sc.nextInt();
        }
        System.out.println(findPoisonedDuration(timeseries, k));
    }

}