package org.example.MultiTasking;

public class ProducerConsumer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.eatPizza();
    }
}

class Chef {
    public void makePizza() {
        System.out.println("Pizza Making");
    }
}

class Customer extends Chef {
    public void eatPizza () {
        super.makePizza();
        System.out.println("Customer eating pizza....");
    }
}