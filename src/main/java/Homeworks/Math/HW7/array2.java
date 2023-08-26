package Homeworks.Math.HW7;

import java.util.Random;

public class array2 {

    public static void main(String[] args)
    {
        int [] numberInput = new int[5];

        Random newNum = new Random();

        for(int i=0;i<numberInput.length;i++)
        {
            numberInput[i] = newNum.nextInt();
        }
        System.out.println("RNG:");
        for(int i=0;i<numberInput.length;i++)
        {
            System.out.print(numberInput[i]+" ");
        }
    }

}
