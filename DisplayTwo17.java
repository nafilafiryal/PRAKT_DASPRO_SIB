import java.util.Scanner;

public class DisplayTwo17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numInput;
        System.out.print("Input some number: ");
        numInput = input.nextInt();
        
        for (int i = 1; i <= numInput; i++) {
            if (i%2 == 0) {
                System.out.println("2 multiple: " + i);
            }
            
        }
    }
}
