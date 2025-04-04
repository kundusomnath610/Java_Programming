package org.example;

public class App {
    public static void main(String[] args) {
//        Car_App c = new Car_App();
//        Car_App.Engine eng = c.new Engine();
//        eng.runCar();
        Car.MusicSystem music = new Car.MusicSystem();
        music.play();
    }
}

class Car {
    String brand = "Maruti";
    static int wheel = 4;

    static class MusicSystem { // Inner class Static
        public void play() {
            System.out.println("Play Music...");
            System.out.println("Wheels = " + wheel);
        }
    }
}














/*
class Car_App {
    private  String brand;
    private  int price;

    public void drive() {
        System.out.println("Drive the car");
    }

    class Engine {
        int hp;
        public  void runCar() {
            hp = 750;
            brand = "Toyota";
            price = 400000;

            System.out.println("Car info: ");
            System.out.println(brand + " " + price + " " + hp);
            drive();
        }
    }
}
 */
