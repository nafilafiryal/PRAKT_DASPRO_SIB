import java.util.Scanner;

public class Assignment3Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = {83, 24, 94, 62, 90, 35, 12, 18, 36, 74};
        System.out.print("Enter the value to search: ");
        int search = input.nextInt();
        for (int i = 0; i < 10; i++) {
            if (search == array[i]) {
                System.out.print("The number " + search + " is in index " + i);
                break;
            } 
            
        }
        
    }

}
