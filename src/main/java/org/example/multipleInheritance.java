package org.example;

class A {
    void display() {
        System.out.println("Class A");
    }
}

class b extends A {
    void watch() {
        System.out.println("Class B");
    }
}

class c extends b {
    void Tv() {
        System.out.println("C class Running");
    }
}



public class multipleInheritance {
    public static void main(String[] args) {
        c obj = new c();
        obj.display();
    }
}
