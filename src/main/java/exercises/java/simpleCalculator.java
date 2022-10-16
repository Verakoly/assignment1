package exercises.java;

public class simpleCalculator {
    public static void displayMenu () {
        System.out.println("Hello, Welcome to my first Java app.");
        System.out.println("It is a simple calculator that can handle two numbers with these operators:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
    }


    public static double addition (double num1, double num2){
        double aResult = num1 + num2;
        return aResult;
    }

    public static double subtraction (double num1, double num2){
        double sResult = num1 - num2;
        return sResult;
    }

    public static double division (double num1, double num2) {
        double dResult = num1 / num2;
        return dResult;
    }

    public static double multiplication (double num1, double num2) {
        double mResult = num1 * num2;
        return mResult;
    }





}
