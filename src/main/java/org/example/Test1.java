package org.example;

public class Test1 {
    public static void main(String[] args) {
        
        new Car();

    }
}

class Car {   
    public Car() {
        this(10);
        System.out.println("0- prem Constructor");
    }

    public Car(int i) {
        this(10, 20);
        System.out.println("1- prem Constructor");
    }

    public Car(int i, int j) {
       // this(20, 30);
        System.out.println("2- prem Constructor");
    }
}
