import java.util.Scanner;
public class TheTriangle17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numInput, i;
        String s = "";

        System.out.print("Input some number: ");
        numInput = input.nextInt();

        for ( i = numInput; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }

    }
}