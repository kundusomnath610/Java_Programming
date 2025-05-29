package org.example.DemonThread;

public class Demon {
    public static void main(String[] args) {
        MajorThread pt = new MajorThread();
        Supportive1Thread tt = new Supportive1Thread();
        tt.setDaemon(true);
        tt.setPriority(1);
        Supportive2Thread dt = new Supportive2Thread();
        dt.setDaemon(true);
        dt.setPriority(1);

        pt.start();
        tt.start();
        dt.start();

    }
}

class MajorThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("MajorActivicty is on....");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Problem occure...");
        }
    }
}

class Supportive1Thread extends Thread {
    public void run() {
        try {
            for (;;) {
                System.out.println("suported1 is on....");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Problem occure...");
        }
    }
}

class Supportive2Thread extends Thread {
    public void run() {
        try {
            for (;;) {
                System.out.println("Suported2 on....");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Problem occure...");
        }
    }
}
