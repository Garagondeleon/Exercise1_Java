package service;
import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public void basicCalc(BasicCalculation bc){  //Sole method for all operations
        try{
            double numA = askForA();
            double numB = askForB();
            double result = bc.calculation(numA, numB);
            if(result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY){
                System.out.println("Cannot divide number / zero...");
            }else{
                System.out.printf("The result of the operation is: %.2f%n",result);
            }
        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
    }
    
    public void showCalculatorMenu(){
        System.out.println("Please choose an option.");
        System.out.println("1.- Sum(a + b)");
        System.out.println("2.- Subtract(a - b)");
        System.out.println("3.- Multiply(a * b)");
        System.out.println("4.- Divide(a / b)");
        System.out.println("5.- Exit.");
    }

    public double askForA(){
        System.out.print("Enter the value for A: ");
        return scanner.nextDouble();
    }

    public double askForB(){
        System.out.print("Enter the value for B: ");
        return scanner.nextDouble();
    }
}
