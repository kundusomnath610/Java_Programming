package org.example;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String:- ");
        String str = scn.nextLine();
        int count = str.length();
        System.out.println("Length is: " + count);
        scn.close();
    }
}
