import java.util.Scanner;

public class ArrayAverageScore17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] score = new int[10];
        double total=0;
        double average;
        int studentPassed = 0;
        int numStudent, numPassed;
        System.out.print("Enter the number of student: ");
        numStudent = input.nextInt();

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i+1) + ": ");
            score[i]=input.nextInt();
        }
        System.out.println("Student who passed: ");
        for (int i = 0; i < numStudent; i++) {
        if (score[i] > 70) {
            System.out.println("Student " + (i+1) );
            studentPassed++;
        }
        }
        
        
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        average = total / score.length;
        System.out.println("The class average score is " + average);
        System.out.println("The number of students passed: " + studentPassed);
    }
}
