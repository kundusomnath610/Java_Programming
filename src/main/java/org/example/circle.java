package org.example;

class redi {
    double rad;
    static double pi = 3.14;
    // Method
    public void area () {
        double area = pi * rad * rad;
        System.out.println("Area " + area);
    }
}

public class circle {
    public static void main(String[] args) {
        redi re = new redi();
        re.rad = 10;
        re.area();

        redi re1 = new redi();
        re1.rad = 20;
        re1.area();
    }
}
