package demo.first;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class FirstHomework {
    public static void main(String [] arg){
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String  name =  scanner.nextLine();
        System.out.println("What is yor favourite hobby");
        String hobby = scanner.nextLine();
        System.out.println("Hello " + name + ", your favourite hobby is " + hobby + "!");


    }

}
