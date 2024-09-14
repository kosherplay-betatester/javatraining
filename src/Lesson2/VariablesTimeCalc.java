package Lesson2;

import java.util.Scanner;

public class VariablesTimeCalc {

    public static void main(String[] args) {
        int minutes;
        System.out.println("please enter your name:");
        Scanner nameScanner = new Scanner(System.in);
        String name = nameScanner.nextLine();
        System.out.println("Hello \n" + name + "\nplease enter minutes number: ");
        Scanner scanner = new Scanner(System.in);
        minutes = scanner.nextInt();
        int hours = minutes/60;
        int minutesLeft = minutes%60;
        System.out.println("Hello "+ name);
        System.out.println(minutes + " minutes has " + hours + " hours, and " + minutesLeft + " minutes");
    }
}
