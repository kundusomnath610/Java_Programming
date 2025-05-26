package org.example.MultiTasking;

public class TaskRunner {
    public static void main(String[] args) throws InterruptedException {
        String tname = Thread.currentThread().getName();
        System.out.println("Current thread: " + tname);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Typing...");
            Thread.sleep(1000); // Sleep for 1 second
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("Checking");
            Thread.sleep(1000);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("Saving");
            Thread.sleep(1000);
        }
    }
}
