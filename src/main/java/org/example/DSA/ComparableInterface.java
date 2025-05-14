package org.example.DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ComparableInterface {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();

            Person p = new Person(name, age);
            list.add(p);
        }

        Collections.sort(list, new Arrange());

        System.out.println("People sorted by age: ");
        for (Person p : list) {
            System.out.println(p);
        }
    }
}

class Arrange implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.age, o2.age); // ascending by age
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person {name=" + name + ", age=" + age + "}";
    }
}
