import java.util.*;

class D19_compare_versions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String version1 = scn.next();
        String version2 = scn.next();
        System.out.print(compareVersion(version1, version2));
    }
    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input two strings
    // It should return required output.

    public static int compareVersion(String version1, String version2) {

        while (version1.charAt(version1.length() - 1) == '0' || version1.charAt(version1.length() - 1) == '.') {
            version1 = version1.substring(0, version1.length() - 1);
        }
        while (version2.charAt(version2.length() - 1) == '0' || version2.charAt(version2.length() - 1) == '.') {
            version2 = version2.substring(0, version2.length() - 1);
        }

        for (int i = 0; i < Math.min(version1.length(), version2.length()); i++) {
            if ((int) version1.charAt(i) < (int) version2.charAt(i)) {
                return -1;
            } else if ((int) version1.charAt(i) > (int) version2.charAt(i)) {
                return 1;
            }
        }
        if (version1.length() > version2.length()) {
            return 1;
        } else if(version1.length() < version2.length()) {
            return -1;
        }else {
            return 0;
        }

    }
}