package Homeworks.VariablesHomWork2;

import java.util.Scanner;

public class SResult {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter first String");
        String name1 = scanner.nextLine();

        System.out.println("Enter second String");
        String name2 = scanner.nextLine();

        boolean name3 = name1.equals(name2);


        // Display the results of the equality checks.
        System.out.println("\"" + name1 + "\" equals \"" +
                name2 + "\"? " );



    }
}
