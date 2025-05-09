package org.example.genirc;

import java.util.ArrayList;


public class GenericList {
    public static  void main(String[] args) {

        Apple a1 = new Apple("Red", 190);
        Apple a2 = new Apple("Green", 200);
        Apple a3 = new Apple("Mix", 300);

        ArrayList<Apple> appleList = new ArrayList<>();
        appleList.add(a1);
        appleList.add(a2);
        appleList.add(a3);

        //display.appleList();


//        Orange o1 = new Orange("red", 180);
//        Orange o2 = new Orange("Green", 200);
//        Orange o3 = new Orange("Mix", 300);

    }
}

class Apple {
    String color;
    int price;
    public Apple (String color, int price) {
        this.color = color;
        this.price = price;
    }
    public String toString() {
        return "Apple [Color= " + color + ", Price" + price + "]";
    }
}

class Orange {
    String color;
    int price;
    public Orange (String color, int price) {
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return "Orange [Color= " + color + ", Price" + price + "]";
    }
}

class Fruit extends  Apple {
    String color;
    int price;

    public Fruit (String color, int price) {
        super(color, price);
        this.color = color;
        this.price = price;
    }
}
