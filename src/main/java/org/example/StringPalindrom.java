package org.example;

import java.util.Scanner;

public class StringPalindrom {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int left = 0;
        int right = str.length() - 1;

        while (left <= right) {
            
        }
        
        scn.close();
    }
}




/*
 * 
 * StringBuilder sb = new StringBuilder(str1);
        String rev = sb.reverse().toString();

        if (str1.equals(rev)) {
            System.out.println("The String" + " str1 " + "is palindrome.");
        } else {
            System.out.println("Not " + str1 + " is palindrome.");
        }
 * 
 */
