package org.example.MultiTasking;

public class Demo4 {
    public static void main(String[] args) {
        VisitDoctor task = new VisitDoctor();
        Thread t1 = new Thread(task);
        t1.setName("Superman");
        Thread t2 = new Thread(task);
        t2.setName("Batman");

        t1.start();
        t2.start();
    }
}

class VisitDoctor implements Runnable {
    synchronized public void run() {
        try {
            String tname = Thread.currentThread().getName();
            System.out.println(tname + " has enter clinic");
            Thread.sleep(2000);
            System.out.println(tname + " Geeting treatment");
            Thread.sleep(2000);
            System.out.println(tname + " Has exited....");
            Thread.sleep(2000);
        } catch(Exception e) {
            //....
        }
    }
}
