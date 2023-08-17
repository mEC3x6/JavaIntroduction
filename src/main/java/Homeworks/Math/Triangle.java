package Homeworks.Math;

public class Triangle {
    //public static int CalculateSofTriangle (int a, int h ){
    //return ((a * h) / 2);
    // S=R^2 * sin(A) * sin(B) * sin(C)

    public static int CalculateSofTriangle(int r, int a , int b, int c) {

        return (int) (Math.pow(r,2) * Math.sin(a) * Math.sin(b) * Math.sin(c));
    }


    }

