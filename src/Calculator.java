import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    public void sum(){
        double numA = askForA();
        double numB = askForB();
        Sum s = (double a , double b) -> a + b;
        double result = s.summing(numA, numB);
        System.out.printf("The result of the sum is: %.2f",result);
    }

    public void subtract(){
        double numA = askForA();
        double numB = askForB();
        Subtract s = (double a, double b) -> a - b;
        double result = s.subtracting(numA, numB);
        System.out.printf("The result of the subtraction is: %.2f",result);
    }

    public void multiply(){
        double numA = askForA();
        double numB = askForB();
        Multiply s = (double a, double b) -> a * b;
        double result = s.multiplying(numA, numB);
        System.out.printf("The result of the multiplication is: %.2f",result);
    }

    public void divide() {
        boolean flag = true;
        double numA;
        double numB;
        do {
            numA = askForA();
            numB = askForB();
            if (numB != 0) {
                flag = false;
            }
            else{
                System.out.println("Cannot divide Numbers/Zero...");
            }
        } while (flag);
        Divide s = (double a, double b) -> a / b;
        double result = s.dividing(numA, numB);
        System.out.printf("The result of the division is: %.2f",result);
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
