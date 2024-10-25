import java.util.Scanner;
/**
 * uts
 */
public class uts {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean completeFile;
        int numTakers;
        String prospectiveEmployee;
        double academicScore, englishScore, nationalismScore, averageScore;
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

        System.out.print("Complete File? (True / False): ");
        completeFile = input.nextBoolean();
        if (completeFile == true) {
            System.out.println("Selection file is complete!");
        } else {System.out.println("Incomplete selection file!");}


    }
}