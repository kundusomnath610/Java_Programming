package org.example;

import java.util.Scanner;

public class StringLower {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String:- ");
        String sentence = scn.nextLine();  // Fixed spelling from 'sentance' to 'sentence'

        StringBuilder sb = new StringBuilder();
        boolean capital = true;  // Fixed spelling 'captital' -> 'capital'

        for (char c : sentence.toCharArray()) {
            if (Character.isWhitespace(c)) {  // Better: use isWhitespace instead of isSpaceChar
                capital = true;
                sb.append(c);
            } else {
                if (capital) {
                    sb.append(Character.toUpperCase(c));
                    capital = false;
                } else {
                    sb.append(Character.toLowerCase(c));  // Lowercase the other characters for safety
                }
            }
        }

        System.out.println("Formatted String is: " + sb.toString());
        scn.close();
    }
}
