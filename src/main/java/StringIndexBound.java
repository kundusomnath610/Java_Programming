import java.util.Scanner;

public class StringIndexBound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int idx = scanner.nextInt();

        if (idx < str.length()) {
            char ch = str.charAt(idx);
            System.out.println("The index of the first occurrence is " + ch);
        } else {
            System.out.println("Invalid index.");
        }
    }
}
