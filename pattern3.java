import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j==1 || j==n||i==1||i==n) {
                    System.out.print(" 5 ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
