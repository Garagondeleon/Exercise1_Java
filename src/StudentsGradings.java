import java.util.*;
import java.util.stream.Collectors;

public class StudentsGradings {

    static Scanner scanner = new Scanner(System.in);
    static Map<String,Double> map = new HashMap<>();
    private String name;
    private int grade;

    public void inputData(){
        System.out.print("Enter your name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter your grade (just the number): ");
        this.grade = scanner.nextInt();
        System.out.print("Please enter the number of signatures to enroll: ");
        int numOfSignatures = scanner.nextInt();
        scanner.nextLine();
        signatures(numOfSignatures);
    }

    public void signatures(int numOfSignatures) {
        for (int i = 0; i < numOfSignatures; i++) {
            System.out.print("Enter the name of signature " + (i + 1)+":  ");
            String signature = scanner.nextLine();
            System.out.print("Enter the score for " + signature + ":  ");
            double score = scanner.nextDouble();
            scanner.nextLine();
            map.put(signature, score);
        }
    }

    public void showResults(){
        System.out.println("\n------------------------------------------------------");
        System.out.printf("Student name: %-24s Grade: %-5d%n" ,this.name, this.grade);
        System.out.println("------------------------------------------------------");
        map.entrySet()
                .stream()
                .forEach(e -> System.out.printf("    Signature: %-23s Score: %-3.1f%n", e.getKey(), e.getValue()));
        System.out.println("------------------------------------------------------");
        double avg = map.values()
                .stream()
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();
        System.out.printf("Final average: %-21.1f   Status: %-4s%n%n", avg, avg > 7 ? "passed" : "failed");
    }

}
