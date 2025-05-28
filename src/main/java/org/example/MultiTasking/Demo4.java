package org.example.MultiTasking;

public class Demo4 {
    public static void main(String[] args) {
        BookmyShow task = new BookmyShow();
        Thread t1 = new Thread(task);
        t1.setName("Superman");
        Thread t2 = new Thread(task);
        t2.setName("Batman");

        t1.start();
        t2.start();
    }
}

class BookmyShow implements Runnable {
    synchronized public void run() {
        try {
            String tname = Thread.currentThread().getName();
            System.out.println(tname + " is selecting seat");
            Thread.sleep(2000);
            System.out.println(tname + " is checking movie list");
            Thread.sleep(2000);
            System.out.println(tname + " is selecting date and place..");
            Thread.sleep(2000);


            synchronized(this) {
                for (int i = 0; i <= 3; i++) {
                    System.out.println(tname + " Movie is going on");
                }
            }

        } catch(Exception e) {
            //....
        }
    }
}
