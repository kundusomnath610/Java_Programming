package org.example.DSA;

import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class compearableInterface {
    public static void main(String[] args) {
        ArrayList<Person> list  = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();

            Person p = new Person(name, age);
            list.add(p);
        }

        Arrange arrange = new Arrange();
        Collections.sort(list, arrange);

        System.out.println("People sorted by age: ");
        for(Object o : list) {
            System.out.println(o);
        }
    }

    class Arrange implements Comparator<P> {
        public int compear(Person o1, Person o2) {
            if (o1.age < o2.age)
                return 1;
            else 
                return 0;
        }
    } 

    class Person {
        String name;
        int age;

        public Person (String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person {name=" + name + ", age=" + age + "}";
        }
    }
}



