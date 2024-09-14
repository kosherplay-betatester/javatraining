package loopsLesson;

import java.util.Scanner;

public class input5sum {

    public static void main(String[] args) {
        double numbers = 0;
        double numbersSum = 0;
        int i ;
        System.out.println("please enter 5 grades");
        Scanner scanner = new Scanner(System.in);
        for(i=0;i<5;i++) {
            numbers = scanner.nextDouble();
            numbersSum += numbers;

        }
        System.out.println(numbersSum);

        numbersSum = numbersSum / i;
        System.out.println("the avg sum of grades is " + numbersSum);
        scanner.close();
    }

}
