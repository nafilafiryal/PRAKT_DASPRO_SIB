import java.util.Scanner;

public class assigment1Aloop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int r = 1; r < 11; r++) {
            for (int c = r; c < 11; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
