package org.example;

import java.util.Scanner;

public class CharacterToString {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter a String:- ");
     String str = scn.nextLine();
     String digit = ""; //Empty String for storing digits

     for (int i = 0; i < str.length(); i++) { // loop for the string end..
        char ch = str.charAt(i);
        if (Character.isDigit(ch)) { // 
            digit += ch;
        }
     }
     System.out.println("The digit is: " + digit);
     scn.close();     
    }
}
