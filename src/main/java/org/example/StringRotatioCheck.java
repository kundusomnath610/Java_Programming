package org.example;

import java.util.Scanner;

public class StringRotatioCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (isRotation(str1, str2)) {
            System.out.println("The string is Rotation String");
        } else {
            System.out.println("The String is not rotation String.");
        }
        sc.close();
    }

    public static boolean isRotation(String str1, String str2) {
        // Check the length..
        if (str1.length() != str2.length()) {
            return false;
        }
        String result = str1 + str1;
        return result.contains(str2);
    }

}
