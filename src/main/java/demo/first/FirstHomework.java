package demo.first;


import java.util.Scanner;

public class FirstHomework {
    public static void main(String [] arg) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What is your favourite hobby?");
        String hobby = scanner.nextLine();
        System.out.println("Hello " + name + ", your favourite hobby is " + hobby + "!");
    }
}
