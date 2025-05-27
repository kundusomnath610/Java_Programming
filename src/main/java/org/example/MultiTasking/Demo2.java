package org.example.MultiTasking;

public class Demo2 {
    public static void main(String[] args) {
        Alphabate at = new Alphabate();
        Number nt = new Number();

        Thread t1 = new Thread(at);
        Thread t2 = new Thread(nt);

        t1.start();
        t2.start();
    }
}

class Alphabate implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Printing");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception handled in Alphabate");
        }
    }
}

class Number implements Runnable {
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Typing");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception handled in Number");
        }
    }
}
