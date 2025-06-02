package org.example.MultiTasking;

public class PizzaDemo {
    public static void main(String[] args) {
        PizzaHouse ph = new PizzaHouse();

        ChefThread chef = new ChefThread(ph);
        CustomerThread customer = new CustomerThread(ph);

        chef.start();
        customer.start();

    }
}

class PizzaHouse {
    int token = 1;
    boolean available = false;
    public void bake() {
        if(available == false) {
            System.out.println("Please made the pizza for customer...");
        }
        boolean available = true;
        if (available == true)
            System.out.println("Pizza is ready to eat...");

        System.out.println("Chef preaperd the order: " + token);
        token++;
    }
    public void eat() {

        if(available == false) {
            System.out.println("Please made the pizza for customer...");
        }
        boolean available = true;
        if (available == true)
            System.out.println("Pizza is ready to eat...");
            
        System.out.println("Customer has collected pizza for order " + token);
    }
}

class ChefThread extends Thread {
    PizzaHouse ph;
    public ChefThread(PizzaHouse ph) {
        this.ph = ph;
    }

    public void run() {
        for (int i = 0; i <= 1000; i++) {
            ph.bake();
        }
    }
}

class CustomerThread extends Thread {
    PizzaHouse ph;

    public CustomerThread(PizzaHouse ph) {
        super();
        this.ph = ph;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++)
            ph.eat();
    }
}
