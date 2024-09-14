package lesson3;

import java.util.Scanner;

public class calcCaseLesson {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        Scanner actions = new Scanner(System.in);
        boolean valid = true;


        System.out.println("please enter first number: ");
        double first = number.nextDouble();
        System.out.println("please enter second number: ");
        double second = number.nextDouble();
        System.out.println("please enter an action +,-,*,/,^(pow) :");
        String action = actions.next();



        double result = 0 ;

        switch (action) {

            case "+":
                result = first + second ;
                break;
            case "-":
                result = first - second ;
                break;
            case "*" :
                result = first * second ;
                break;
            case "/" :
                if(first == 0 || second == 0) {
                    System.out.println("can not devide by 0");
                    valid = false;}
                    else
                    result = first / second ;
                break;
            case "^" :
                result = Math.pow(first,second) ;
            default:
                System.out.println("not a valid action");
                valid = false;
        }
        if(valid==true)
    System.out.println("the result is : " + result);
    }

}
