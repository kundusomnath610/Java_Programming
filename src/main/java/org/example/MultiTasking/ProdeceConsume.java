package org.example.MultiTasking;

public class ProdeceConsume {
    public static void main(String[] args) {
        PizzaHouse ph = new PizzaHouse();
        ChefThread ct = new ChefThread(ph);
        CustomerThread cthread = new CustomerThread(ph);

        ct.start();
        cthread.start();
        
    }
}

class ChefThread extends Thread {
    PizzaHouse ph;
    
    public ChefThread (PizzaHouse ph) {
        System.out.println("Pizza is Baking hot...");
    }

}

class CustomerThread extends Thread {
    PizzaHouse ph;

    public CustomerThread (PizzaHouse ph) {
        System.out.println("Customer is eating pizza...");
    }
}

class PizzaHouse extends Thread {
    int token = 1;
    public void bake() {
        System.out.println("Chef is calling Bakeing...");
    }

    public void eat() {
        System.out.println("Customer is calling eat");
    }
}
