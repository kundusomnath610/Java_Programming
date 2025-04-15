package org.example;

import java.util.*;

public class StringJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text!");
        String input = scanner.nextLine();
        String s1 = "" + input;
        String s2 = new String("input");
        System.out.println("String created using double quote: " + s1);
        System.out.println("String created using new keyword: " + s2);

        System.out.println("Are the two string euqal by '==' ? " + (s1 == s2));
        System.out.println("Are the two string equal by 'equals()' ? " + s1.equals(s2));

        scanner.close();
    }
}
