package org.example;

public class CheckDuplicate {
    public static void main(String[] args) {
        String str = "mac"; // return true false
        System.out.println(duplicateCharecter(str));
    }

    public static boolean duplicateCharecter(String str) {
        int n = str.length();
        for (int i = 0; i <= n; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
}
