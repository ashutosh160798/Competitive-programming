import java.util.*;
import java.lang.*;
import java.io.*;

class D14_logger {

    static class Logger {

        /**
         * Initialize your data structure here.
         */

        HashMap<String, Integer> map;

        public Logger() {
            map = new HashMap<>();
        }

        /**
         * Returns true if the message should be printed in the given timestamp,
         * otherwise returns false. If this method returns false, the message
         * will not be printed. The timestamp is in seconds granularity.
         */
        public boolean shouldPrintMessage(int timestamp, String message) {

            if (!map.containsKey(message)) {
                map.put(message, timestamp);
                return true;
            } else {
                if (timestamp - map.get(message) >= 10) {
                    map.put(message, timestamp);
                    return true;
                } else {
                    return false;
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logger lg = new Logger();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        String[] S = new String[n];
        for (int i = 0; i < n; i++) {
            S[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(lg.shouldPrintMessage(arr[i], S[i]) + " ");
        }
    }

}