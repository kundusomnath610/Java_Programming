package org.example.SeriallizeDeserialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Seriallizationn {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fs = new FileInputStream("Output.txt");
        ObjectInputStream ois = new ObjectInputStream(fs);

        Student st = (Student) ois.readObject();
        System.out.println(st);
        ois.close();
    }
}

class Student implements Serializable {
    int roll;
    String name;
    float cgpa;
    transient int otp;
    public Student(int roll, String name, float cgpa, int otp) {
            this.roll = roll;
            this.name = name;
            this.cgpa = cgpa;
            this.otp = otp;
    }
    @Override
    public String toString() {
        return "Student(roll = " + roll + " Name = " + name + "cgpa " + cgpa + "OTP is: " + otp + ")";
    }
}
