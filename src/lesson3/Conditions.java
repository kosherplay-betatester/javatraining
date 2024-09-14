package lesson3;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {

        Scanner ageScanner = new Scanner(System.in);
        System.out.println("enter your age to get a free beer! ");
        double ageAsDoubleToCovert = ageScanner.nextDouble();

        int age = (int)ageAsDoubleToCovert;
        if(age==17) {
            System.out.println("you are too young come back in a year");
            return;}
        if (age < 18) {
            System.out.println("you are too young come back in " + (18 - age) + " years");
        }

        else {
            System.out.println("Enjoy your beer!");
        }
    }
}
