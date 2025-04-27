package org.example;

import java.util.Scanner;

public class CharacterToString {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter a String:- ");
     String str = scn.nextLine();
     String digit = "";

     for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (Character.isDigit(ch)) {
            digit += ch;
        }
     }
     System.out.println("The digit is: " + digit);
     scn.close();     
    }
}
