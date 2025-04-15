package org.example;

import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String og = scanner.nextLine();
        String suf = scanner.nextLine();

        String userName = og.concat(suf);
        System.out.println("Original Username: " + og);
        System.out.println("New User: " + " " +userName);

        scanner.close();
    }
}





/*
*
*
        String s = "Kodnest";

        System.out.println(s.length());
        System.out.println(s.charAt(5));
        System.out.println(s.substring(2, 6));
        System.out.println(s.substring(3));
*
*
*
*
* */