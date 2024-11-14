import java.util.Scanner;

public class assignment1Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int array[];
        array = new int[30];
        for (int i = 0; i < 30; i++) {
            System.out.print("Enter number : ");
            array[i] = input.nextInt();
        }
        for (int i = 0; i < 30; i++) {
            System.out.println("Array of elements " + i + " is valued " + array[i] );
        }
    }
}
