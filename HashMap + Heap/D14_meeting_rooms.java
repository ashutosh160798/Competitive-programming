import java.util.*;

public class D14_meeting_rooms {

    // This is a functional problem. You have to complete this function.
    // It takes as input a 2D array
    // It should return the min number of meeting rooms required.
    public static int minMeetingRooms(int[][] intervals) {

        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);
        int i = 0;
        int j = 0;
        int ans = 0;
        while (i < start.length && j < end.length) {
            int x = 0;
            while (i < start.length && start[i] < end[j]) {
                i++;
                x++;
            }
            ans = Math.max(ans, x);
            j++;
        }
        return ans;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for number of meetings.
        int N = sc.nextInt();

        int[][] intervals = new int[N][2];

        int start, end;
        // Input for intervals.
        for (int i = 0; i < intervals.length; i++) {

            start = sc.nextInt();
            end = sc.nextInt();

            intervals[i][0] = start;
            intervals[i][1] = end;
        }

        int result = minMeetingRooms(intervals);

        System.out.println(result);

    }

    // Function to display a 2D array.
    public static void display(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }


    }

}