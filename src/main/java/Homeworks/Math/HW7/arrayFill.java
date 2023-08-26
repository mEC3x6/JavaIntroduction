

package Homeworks.Math.HW7;


public class arrayFill {

    public static void main(String[] args)
    {
        int [] number = new int[5];

        for(int i=0;i<number.length;i++)
        {
            double newNum =  Math.random();
            number[i] = (int)(newNum*1e1);
        }

        System.out.println("Random generated numbers are:");
        for(int i=0;i<number.length;i++)
        {
            System.out.print(number[i]+" ");
        }
    }

}
