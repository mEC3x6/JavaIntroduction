package mathDemo;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(0,1000));
        System.out.println(random.nextInt(500));
    }
}