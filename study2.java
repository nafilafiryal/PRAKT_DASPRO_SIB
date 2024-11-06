import java.util.Scanner;
public class study2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int hourStudyDaily, totalHour = 0;

        int i = 1;
        while (i <= 7) {
            System.out.print("Enter number of hours study day " + i + ": ");
            hourStudyDaily = input.nextInt();
            

            if (hourStudyDaily > 10) {
                System.out.println("Invalid input!");
                System.out.print("Enter number of hours study day " + i + ": ");
                hourStudyDaily = input.nextInt();
                continue;
            } 
            
            totalHour += hourStudyDaily;
            i++;
        }
        System.out.println("The total hours of study for 1 week: " + totalHour + " hour.");
        totalHour = input.nextInt();

        
        
    }
}


