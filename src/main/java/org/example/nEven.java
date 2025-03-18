package org.example;

import java.util.Scanner;

public class nEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("The first " + n + " even number are:" );
        for (int i = 1; i <= n; i++) {
            System.out.println(i * 2);
        }
        scn.close();
    }
}
