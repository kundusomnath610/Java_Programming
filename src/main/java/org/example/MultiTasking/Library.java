package org.example.MultiTasking;

public class Library {
    public static void main(String[] args) {

        ReaderThread rt = new ReaderThread();
        rt.start();
    }
}

class ReaderThread extends Thread {
    Book book = new Book();
    public void run() {
        try {
            book.read();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Book {
    String book1 = "Java";
    String book2 = "SQL";
    String book3 = "Python";

    public void read() throws InterruptedException {
        synchronized(book1) {
            System.out.println("Reader has Occupied: " + book1);
        }

        synchronized(book2) {
            System.out.println("Reader has Occupied: " + book2);
        }

        synchronized(book3) {
            System.out.println("Reader has Occupied: " + book3);
        }

        System.out.println("Reader has released book3: " + book3);
        System.out.println("Reader has released book2: " + book2);
        System.out.println("Reader has realesed book1: " + book1);
    }
}

