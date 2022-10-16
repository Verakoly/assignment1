package exercises.java;

import java.util.Scanner;

/**
 * Simple Console Calculator!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        simpleCalculator.displayMenu();
        Scanner sc = new Scanner(System.in);

        boolean condition = true;   //if condition is true execute the next body of commands

        while (condition) {

            System.out.println("Enter operation type (+ , - , / , *)");
            char operatorType = sc.next().charAt(0);
            System.out.println("Enter your first number: ");
            double digit1 = sc.nextInt();
            System.out.println("Enter your second number: ");
            double digit2 = sc.nextInt();


            switch (operatorType) {
                case '+':
                    double digitSum = simpleCalculator.addition(digit1, digit2);
                    System.out.println(digitSum);
                    break;

                case '-':
                    double digitSub = simpleCalculator.subtraction(digit1, digit2);
                    System.out.println(digitSub);
                    break;

                case '/':
                    double digitDiv = simpleCalculator.division(digit1, digit2);
                    System.out.println(digitDiv);
                    break;

                case '*':
                    double digitMul = simpleCalculator.multiplication(digit1, digit2);
                    System.out.println(digitMul);
                    break;

                default:
                    System.out.println("Operator type is not supported. Please review, and try again.");
            }

            System.out.println("Do you want to continue? (yes / no");
            String continueOp = sc.next();
            if (continueOp.equalsIgnoreCase("no")) {
                condition = false;
            }
        }

    }
}
