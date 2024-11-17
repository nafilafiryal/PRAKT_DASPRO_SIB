import java.util.Scanner;

public class AssignmentJobsheet9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numElements = input.nextInt();
        int[] arrayElements = new int[numElements];

        for ( int i = 0; i < numElements; i++) {
            System.out.print("Enter the array element " + i + ": ");
            arrayElements[i] = input.nextInt();
        }
        int highest = arrayElements[0], lowest = arrayElements[0], sum = arrayElements[0];
        for (int i = 1; i < numElements; i++) {
            if (arrayElements[i] > highest) {
                highest = arrayElements[i];
            }
            if (arrayElements[i] < lowest) {
                lowest = arrayElements[i];
            }
            sum += arrayElements[i];
        }
        double average = (double) sum/numElements;
        System.out.println("Highest value: " + highest);
        System.out.println("Lowest value: " + lowest);
        System.out.println("Average value: " + average);
    }
}
