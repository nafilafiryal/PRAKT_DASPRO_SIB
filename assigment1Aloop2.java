import java.util.Scanner;

public class assigment1Aloop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int r = 1; r <= 10; r++) {
            for (int s = 1; s <= 10 - r; s++) {
                System.out.print("  ");
            }
            for (int c = 1; c <= r; c++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
