import java.util.Base64;
import java.util.Scanner;

public class Encoder {

    static Scanner scanner = new Scanner(System.in);
    public void stringToBase64(){
        System.out.println("Please enter the string to encode: ");
        String input = scanner.nextLine();
        String encodedString = Base64.getEncoder().encodeToString(input.getBytes());
        System.out.println("The encoded string is: " + encodedString);
    }

    public void base64ToString(){
        System.out.println("Please enter the string to decode: ");
        String input = scanner.nextLine();
        byte[] decodedBytes = Base64.getDecoder().decode(input);
        String decodedString = new String(decodedBytes);
        System.out.println("The decoded string is: " + decodedString);
    }
    public void showEncoderMenu(){
        System.out.println("Please choose an option.");
        System.out.println("1.- Encode a string to Base64.");
        System.out.println("2.- Decode Base64 to a string.");
        System.out.println("3.- Exit.");

    }
}
