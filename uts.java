import java.util.Scanner;
/**
 * uts
 */
public class uts {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean completeFile, passesTestSelection, passesDocumentSelection;
        int numTakers;
        String prospectiveEmployee, healthPhysical, healthMental;
        double academicScore, englishScore, nationalismScore, averageScore, gpa;
        System.out.print("Insert name prospective employee: ");
        prospectiveEmployee = input.next();
        System.out.print("Enter the number of test takers: ");
        numTakers = input.nextInt();
        System.out.print("Enter academic potential test score: ");
        academicScore = input.nextDouble();
        System.out.print("Enter English test score: ");
        englishScore = input.nextDouble();
        System.out.print("Enter nationalism test score: ");
        nationalismScore = input.nextDouble();

        
        if (academicScore >= 0 && academicScore <= 100) {
            if (englishScore >= 0 && englishScore <= 100) {
                if (nationalismScore >= 0 && nationalismScore <= 100) {
                    
                } else {System.out.println("Invalid score! Please enter a score between 0 and 100.");}
            } else {System.out.println("Invalid score! Please enter a score between 0 and 100.");}   
        } else {System.out.println("Invalid score! Please enter a score between 0 and 100.");}
        averageScore = (academicScore + englishScore + nationalismScore) / 3;
        System.out.println("Average Score Test: " + averageScore);
        System.out.println("Test Selection Completed!");

        passesTestSelection = (averageScore >= 78) && (academicScore >= 75) && (englishScore >= 75) && (nationalismScore >= 75);
        if (passesTestSelection) {
            System.out.println("Test Taker " + numTakers + " " + "PASS the test selection. Proceed to file selection.");
            System.out.print("Enter IPK: ");
            gpa = input.nextDouble();
            System.out.print("Is the test taker physically fit? (yes/no): ");
            healthPhysical = input.next();
            System.out.print("Is the test taker spiritually healthy? (yes/no): ");
            healthMental = input.next();
            passesDocumentSelection = (gpa >= 3.25 && gpa <= 4.00) && healthPhysical.equalsIgnoreCase("yes") && healthMental.equalsIgnoreCase("yes");
            if (passesDocumentSelection) {
                System.out.println("Test taker " + numTakers + " " + "Accepted." );
            } else {System.out.println("Test Taker " + numTakers + " " + "Not Accepted (he completeness of the file does not meet the requirements).");}
        } else {System.out.println("Test Taker " + numTakers + " " + "DO NOT PASS the test selection.");}
    }
}