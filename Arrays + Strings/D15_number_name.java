import java.util.Scanner;

public class D15_number_name {

    private static String[] got = {"", "Thousand", "Million", "Billion", "Trillion"};
    private static String[] teens = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a == 0) {
            System.out.print("Zero");
        } else {
            System.out.print(f1(a, 0).substring(1));

        }

    }

    static String f1(int n, int i) {

        if (n == 0)
            return "";

        return f1(n / 1000, i + 1) + " " + f2(n % 1000) + " " + got[i];

    }

    static String f2(int n) {

        if (n > 100) {
            return teens[n / 100] + " " + "Hundred" + " " + f2(n % 100);
        } else if (n >= 20) {
            return tens[n / 10] + " " + f2(n % 10);
        } else {
            return teens[n];
        }


    }
}
