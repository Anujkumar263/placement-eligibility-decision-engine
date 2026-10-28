
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read candidate details
        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

        // Create Candidate object
        Candidate candidate = new Candidate(
                name,
                percentage,
                backlogs,
                graduationYear
        );

        // Display candidate details using getters
        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Percentage: " + candidate.getPercentage());
        System.out.println("Backlogs: " + candidate.getBacklogs());
        System.out.println("Graduation Year: " + candidate.getGraduationYear());

        scanner.close();
    }

}
