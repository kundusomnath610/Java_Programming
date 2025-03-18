package org.example;

public class reverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reverse = 0;

        while (number > 0) {
            int res = number % 10;
            reverse = (reverse * 10) + res;
            number = number / 10;
        }
        System.out.println("Reverse is: " + reverse);
    }
}
