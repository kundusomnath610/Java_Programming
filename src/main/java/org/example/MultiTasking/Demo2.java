package org.example.MultiTasking;

public class Demo2 {
    public static void main(String[] args) {
        String tname = Thread.currentThread().getName();
        System.out.println("Thread is excuting the main() " + tname);
    }
}

class MyThread extends Thread {
    public void run() {
        String tname = Thread.currentThread().getName();
        System.out.println("Thread is running()" + tname);
    }
}
