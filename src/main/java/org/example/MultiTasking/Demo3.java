package org.example.MultiTasking;


public class Demo3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Enrolled Student");
        Tranning tt = new Tranning();
        PlaceMentThread pt = new PlaceMentThread();

        tt.start();
        pt.start();
    }
}

class Tranning extends Thread {
    public void run() {
        try {
            System.out.println("Tranning is started....");
            Thread.sleep(1000);
            System.out.println("Training is on...");
            Thread.sleep(1000);
            System.out.println("training has ended");
        } catch (Exception e) {
            System.out.println("Some Problem arise...");
        }
    }
}


class PlaceMentThread extends Thread {
    public void run() {
        try {
            System.out.println("Tranning is started....");
            Thread.sleep(1000);
            System.out.println("Training is on...");
            Thread.sleep(1000);
            System.out.println("training has ended");
        } catch (Exception e) {
            System.out.println("Some Problem arise...");
        }
    }
}
