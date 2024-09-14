package loopsLesson;

import java.util.Scanner;
// this program divides inputted numbers to all divisions and if it is a prime it output result as a prime number
public class dividerCalcAndPrimeDetector {

    public static void main(String[] args) {
        int inputNumber;
        int i;
        int devider;
        int deviderCounter = 0 ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number :");
        inputNumber = scanner.nextInt();
        for (i=inputNumber;;i--) {
            devider = i;

          //  System.out.println(i);

            if (i==0){break;}

            if(inputNumber%i==0){
            System.out.println("devider is :" + devider);deviderCounter++;
//my original working solution //  if (deviderCounter == 2 && deviderCounter > 1 && deviderCounter <3 && devider==1) {
            if (deviderCounter == 2 && devider == 1) { /*shorter solution suggested by ide*/
                System.out.println(inputNumber + " is a prime number");
            }
                if (i==1){break;}
                }

        }
    }
}
