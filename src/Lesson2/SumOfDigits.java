package Lesson2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a 3 digit num:");
        int number = scanner.nextInt();
        int digits = number % 10;
        int hunds = number / 100;
        int tens = number % 100/10;

        System.out.println("the sum of digits = " + (digits+hunds+tens));


    }
}
