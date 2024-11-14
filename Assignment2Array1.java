import java.util.Scanner;

public class Assignment2Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] month = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        for (int i = 0; i < 12; i++) {
            System.out.print("Enter a number (1-12): ");
            int monthnumber = input.nextInt();
            System.out.println("This number is month: " + month[monthnumber-1]);
        }
        
        
    }
}
