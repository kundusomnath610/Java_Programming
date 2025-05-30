package org.example.MultiTasking;

public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {

        Chef chef = new Chef();
        Customer customer = new Customer();

        Thread t1 = new Thread(chef);
        Thread t2 = new Thread(customer);

        t1.start();
        t2.start();

    }
}

class Chef extends Thread {
    public void run() {
       try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(2000);
                System.out.println("Pizza Making");
            }
        } catch (Exception e) {
            System.out.println("Exception Occure");
       }
    }
}

class Customer extends Thread {
    public void run () {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(2000);
                System.out.println("Customer eating pizza....");
            }
        } catch (Exception e) {
            System.out.println("Exception occure");
        }
    }
}