package Homeworks.Homework3;

import java.util.Scanner;

public class TheDayOfTheWeek {
    public static void main(String[] args)
    {
        Scanner days = new Scanner(System.in);
        System.out.print("Choose a number: ");
        int day = days.nextInt();

        System.out.println(getDay(day));
    }

    public static String getDay(int day) {
        String nameDays = "";
        switch (day){
            case 1: nameDays = "Monday";
                break;
            case 2: nameDays = "Tuesday";
                break;
            case 3: nameDays = "Wednesday";
                break;
            case 4: nameDays = "Thurstday";
                break;
            case 5: nameDays = "Friday";
                break;
            case 6: nameDays = "Saturday";
                break;
            case 7: nameDays = "Sunday";
                break;
            default: nameDays = "Invalid input";
        }
        return nameDays;
    }

}
