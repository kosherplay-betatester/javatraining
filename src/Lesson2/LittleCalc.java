package Lesson2;

import java.util.Scanner;

public class LittleCalc {

    public static void main(String[] args) {

        double first,second,result;
        Scanner reader = new Scanner(System.in);
        System.out.println("enter 1rst num :");
        first = reader.nextDouble();

        System.out.println("enter 2nd num :");
        second = reader.nextDouble();

        System.out.println("the result is \n" + first + " + " + second + " = " +(first + second));
    }
}
