import java.util.Scanner;

public class ArrayValue17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] finalScore = new int[10];
        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Enter the final score " + i + ": ");
            finalScore[i] = input.nextInt();
        }
        for (int i = 0; i < finalScore.length; i++) {
            if (finalScore[i] > 70) {
                System.out.println("Student " + i + " Passed!");
            } else {
                System.out.println("Student " + i + " Failed!");
            }
        }
    }
}
