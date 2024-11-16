import java.util.Scanner;

public class ArrayAverageScore17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] score = new int[10];
        double averagePassed, averageFailed;
        int studentPassed=0, studentFailed=0, numPassed=0, numFailed=0;
        int numStudent;

        System.out.print("Enter the number of student: ");
        numStudent = input.nextInt();
        for (int i = 0; i < numStudent; i++) {
            System.out.print("Enter the final score " + i + ": ");
            score[i]=input.nextInt();
        }
        for (int i = 0; i < numStudent; i++) {
        if (score[i] > 70) {
            studentPassed += score[i];
            numPassed++;
        } else {
            studentFailed += score[i];
            numFailed++;
        }
        }
        averagePassed = (double)studentPassed / numPassed;
        averageFailed = (double)studentFailed / numFailed;
        System.out.println("The average score of students who passed is " + averagePassed);
        System.out.println("The average score of students who failed is " + averageFailed);
    }
}
