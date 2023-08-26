package Homeworks.Math.HW7;
import java.util.Random;

public class array3 {
    public static void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }

    public static void main(String[] args) {
        int arrayLength = 5;
        int[] myArray = new int[arrayLength];
        fillArrayWithRandomNumbers(myArray);
        for (int num : myArray) {
            System.out.println(num);
        }
    }
}