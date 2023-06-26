package Lectures2;

public class AritmeticOperation {
    public static void main(String[] args) {
     int number = 10;
     int num2 = 20;
       //if number is odd or even
        System.out.println(5 % 2);

        System.out.println(number++);
        System.out.println(++num2);
        System.out.println(number);

        System.out.println(number != num2); //true

        System.out.println(number != num2 && true );//true
        System.out.println(number != num2 && false ); //false
        System.out.println(number != num2 || true );  //true
        System.out.println(number != num2 || false); //true
        System.out.println(number != num2 || false); // false

        int sum = number +num2;
        sum +=8;
        System.out.println(sum);

        System.out.println((num2>number ? "num2 is greater" : "number is equal or smaller to num2  " ));






    }
}
