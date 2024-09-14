package Lesson2;

import java.util.Scanner;

public class CelssToFaren {

    // 32 + celsius*9/5


    public static void main(String[] args) {

        final int BASE = 32 ;
        final double FACTOR = (double) 9 /5;


        Scanner celsiusInput = new Scanner(System.in);
        System.out.println("enter celsius to get in faren:");
        Double celsius = celsiusInput.nextDouble();

        Double faren = BASE + celsius*FACTOR;
        System.out.println(celsius + " degrees is " + (faren) + " in faren");
    }
}
