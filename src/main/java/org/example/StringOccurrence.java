package org.example;

import java.util.Scanner;

public class StringOccurrence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String:- ");
        String str = scn.nextLine().toLowerCase();
        System.out.println("Enter a Chracter which i want to matched:- ");
        String ch = scn.nextLine().toLowerCase();
        char chrac = ch.charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chrac) {
                count++;
            }
        }

        System.out.println("Original String is: " + str);
        System.out.println("Enter char is:- " + chrac);
        System.out.println("Total matched char is:- " + count);

        scn.close();
    }
}
