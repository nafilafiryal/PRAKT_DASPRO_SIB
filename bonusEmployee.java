import java.util.Scanner;

public class bonusEmployee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hoursWorked, dailySalary;
        double bonus, bonusDailySalary;

        int i = 1;
        while (i >= 1) {
            System.out.print(i + ". Number of hours worked (number negative to exit!): ");
            hoursWorked = input.nextInt();
            if (hoursWorked < 0 ) {
                System.out.println("Invalid input! Exit the program.");
                break;
            } i++;
            System.out.print("Employee's daily salary: Rp ");
            dailySalary = input.nextInt();

            if (hoursWorked > 8) {
                bonus = 0.2 * dailySalary;
                System.out.println("Bonus of the daily salary: Rp " + bonus);
                bonusDailySalary = dailySalary + (0.2 * dailySalary) ;
                System.out.println("Total Daily Salary after include bonus: Rp " + bonusDailySalary);

            }
        }

    }
}
