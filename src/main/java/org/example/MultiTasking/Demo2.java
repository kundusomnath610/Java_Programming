package org.example.MultiTasking;

public class Demo2 {
    public static void main(String[] args) {
        Alphabate at = new Alphabate();
        Number nt = new Number();

        at.start();
        nt.start();
    }
}

class Alphabate extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Printing");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception handled");
        }
    }
}

class Number extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Typing");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception handled");
        }
    }
}
