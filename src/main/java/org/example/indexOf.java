package org.example;

import java.util.Scanner;

public class indexOf {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a String:- ");
        String s = scn.nextLine();
        char ch = scn.nextLine().charAt(0);

        int index = s.indexOf(ch);

        if (index == -1) {
            System.out.println("Char Not found");
        } else {
            System.out.println("The index is first occurence in " + index + ".");
        }
        scn.close();
    }
}
