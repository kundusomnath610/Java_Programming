package org.example.MultiTasking;


public class Demo {
    public static void main(String[] args) throws InterruptedException{

        TypeThread tt = new TypeThread();
        ErrorThread et = new ErrorThread();
        SaveThread st = new SaveThread();

        tt.start();
        et.start();
        st.start();

    }
}

class TypeThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Typing....");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception Handle...");
        }
    }
}

class ErrorThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Compiling....");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception Handle...");
        }
    }
}

class SaveThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Saving....");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception Handle...");
        }
    }
}
