package org.example;

import java.util.Scanner;

class Bank {
    private int balance = 10000;
    private int password = 450;

    public void setBalance(int newBalance, int userPass) {
        if (password == userPass) {
            balance = newBalance;
        } else {
            System.out.println("Wrong Password");
        }
    }

    public int getBalance(int userPass) {
        if (password == userPass) {
            return balance;
        } else {
            System.out.println("Wrong Password");
            return 0;
        }
    }
}

public class BankCustomer {
    public static void main(String[] args) {
        Bank b = new Bank();
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Valid Password: ");
        int n = scn.nextInt();
        System.out.println("Balanced: " + b.getBalance(n));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter New Balance: ");
        int newBal = sc.nextInt();
        b.setBalance(n, newBal);
        System.out.println("Balance = " + b.getBalance(newBal));

        scn.close();
        sc.close();
    }
}
