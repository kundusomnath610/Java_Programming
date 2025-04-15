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
    }
}
