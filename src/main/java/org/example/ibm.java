package org.example;

public class ibm {

    public static int pwdString(String pwd) {
        // write your code
        int count = 0;
        for (int i = 0; i < pwd.length(); i = i+2) {
            if (pwd.charAt(i) != pwd.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //String str = "101011"; // Output 2
        String str = "10011010"; // Output 4
        System.out.println("The String flip is: " + pwdString(str));
    }
}
