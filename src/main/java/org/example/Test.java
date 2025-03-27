package org.example;

public class Test {
    public static void main(String[] args) {
        new Car();
        new Car(10);
        new Car(10, 20);
    }
}

class Car {

    public Car() {
        System.out.println("0 - prem pass");
    }

    public Car(int i) {
        System.out.println("1- prem pass");
    }
    public Car(int i, int j) {
        System.out.println("2- prem pass");
    }
}
