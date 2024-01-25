import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        do{
            showMenu();
            int option = getOption();
            switch(option){
                case 1:
                    boolean flagCalc = true;
                    do {
                        System.out.println("--Basic calculator--");
                        Calculator calc = new Calculator();
                        calc.showCalculatorMenu();
                        int calcOption = getOption();
                        switch(calcOption){
                            case 1:
                                System.out.println("--Sum--");
                                calc.sum();
                                break;
                            case 2:
                                System.out.println("--Subtract--");
                                calc.subtract();
                                break;
                            case 3:
                                System.out.println("--Multiply--");
                                calc.multiply();
                                break;
                            case 4:
                                System.out.println("--Divide--");
                                calc.divide();
                                break;
                            case 5:
                                flagCalc = false;
                                break;
                            default:
                                System.out.println("Not a valid input...");
                                break;
                        }
                    }while(flagCalc);
                    break;
                case 2:
                    boolean flagEncoder = true;
                    do{
                        System.out.println("--Encoder--");
                        Encoder encoder = new Encoder();
                        encoder.showEncoderMenu();
                        int encoderOption = getOption();
                        switch(encoderOption){
                            case 1:
                                System.out.println("--String to Base64--");
                                encoder.stringToBase64();
                                break;
                            case 2:
                                System.out.println("--Base64 to String--");
                                encoder.base64ToString();
                                break;
                            case 3:
                                flagEncoder=false;
                                break;
                            default:
                                System.out.println("Not a valid input...");
                                break;
                        }
                    }while(flagEncoder);
                    break;
                case 3:
                    System.out.println("--Student average calculator--");
                    StudentsGradings student = new StudentsGradings();
                    student.inputData();
                    student.showResults();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    flag = false;
                    break;
                default:
                    System.out.println("Not a valid input...");
                    break;
            }
        }while(flag);
    }

    static void showMenu(){
        System.out.println("--Menu--");
        System.out.println("Please choose an option.");
        System.out.println("1.- Basic calculator.");
        System.out.println("2.- Encoder.");
        System.out.println("3.- Student average calculator.");
        System.out.println("4.- Exit.");
    }

    static int getOption(){
        System.out.print("Option: ");
        return scanner.nextInt();

    }
}