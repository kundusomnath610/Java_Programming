package org.example;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();

        StringBuilder sb = new StringBuilder(str1);
        String rev = sb.reverse().toString();

        if (str1.equals(rev)) {
            System.out.println("The String" + " str1 " + "is palindrome.");
        } else {
            System.out.println("Not " + str1 + " is palindrome.");
        }
        scn.close();
    }
}
