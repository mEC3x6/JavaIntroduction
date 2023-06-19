package demo.first;

import java.util.Scanner;

//defition of class
public class FirstDemo {
    public static void main (String [] args){
        //method
        System.out.println("Hello JAVA");
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String  name =  scanner.nextLine();
        System.out.println("How old are you");
        int age = scanner.nextInt();
        System.out.println("Nice to meet you, " + name + ". Your age is: " + age);

    }
}
