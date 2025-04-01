package org.example;

public class copyConstructor {
    public static void main(String[] args) {
        Candidate c1 = new Candidate("Somnath", "cse", 2022, 8.0, "jis");
        Candidate c2 = new Candidate("Somnath kundu", "cse", 2022, 8.6, "jis");
        Candidate c3 = new Candidate("Rajesh", "cse", 2022, 8.9, "IEM");
        Candidate c4 = new Candidate("Rana", "cse", 2024, 8.65, "Techno India");

        c1.Display();
        c2.Display(); 
        c3.Display();
        c4.Display();
    }

}

class Candidate {
    String name;
    String branch;
    int yop;
    double cgpa;
    String insitute;

    public Candidate(String name, String branch, int yop, double cgpa, String institute) {
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
        this.insitute = institute;
    }

    public void Display() {
        System.out.println("The Name is: " + name);
        System.out.println("The branch is: " + branch);
        System.out.println("The cgpa is: " + cgpa);
        System.out.println("The institute is: " + insitute);
        System.out.println();
    }
}
