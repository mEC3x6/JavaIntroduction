package Homeworks.Homework3;

import java.util.Scanner;
public class HighNumberOf3 {
    public static void main(String[] args) {
        int a, b, c, largest;

        Scanner scanner = new Scanner(System.in);

        System.out.println("First number:");
        a = scanner.nextInt();
        System.out.println("Second number:");
        b = scanner.nextInt();
        System.out.println("Third number:");
        c = scanner.nextInt();
        largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("The largest number is: " + largest);

    }
}