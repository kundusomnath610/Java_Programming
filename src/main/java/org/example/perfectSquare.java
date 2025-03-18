package org.example;

import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        double sqrt = Math.sqrt(num);
        if (sqrt == (int)sqrt) {
            System.out.println("The number is perfect Square Root: " + sqrt);
        } else {
            System.out.println("The number is not perfect Square Root: " + num);
        }
        scn.close();
    }
}
