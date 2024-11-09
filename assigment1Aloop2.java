import java.util.Scanner;

public class assigment1Aloop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = 5;
        char letter = 'a';

        for (int i = 1; i <= row; i++) {
            for (int j = row - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(letter++);
                if (letter > 'z') {
                    letter = 'a';
                }
            }
            System.out.println();
        }
    }
}
