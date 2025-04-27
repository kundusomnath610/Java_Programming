package org.example;

import java.util.Scanner;

public class StringOccurrence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String:- ");
        String str = scn.nextLine().toLowerCase(); // String input with lower case
        System.out.println("Enter a Chracter which i want to matched:- ");
        String ch = scn.nextLine().toLowerCase(); // Input Chracter with lower case
        char chrac = ch.charAt(0); // identify the char
        int count = 0;

        for (int i = 0; i < str.length(); i++) { // Loop till string length
            if (str.charAt(i) == chrac) { // if found matched with input char
                count++; // increase count variable
            }
        }

        System.out.println("Original String is: " + str); // print original string 
        System.out.println("Enter char is:- " + chrac); // Press the charcater
        System.out.println("Total matched char is:- " + count); // print the matched char count

        scn.close();
    }
}
