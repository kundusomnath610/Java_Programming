package org.example;

public class aplhabateDaimond {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'E'; j > i; j--) {
                System.out.print(" ");
            }
            for (char j = 'A'; j <= i; j++) {
                if (j == 'A' || j == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

        for (char i = 'D'; i >= 'A'; i--) {
            for (char j = 'E'; j > i; j--) {
                System.out.print(" ");
            }
            for (char j = 'A'; j <= i; j++) {
                if (j == 'A' || j == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
