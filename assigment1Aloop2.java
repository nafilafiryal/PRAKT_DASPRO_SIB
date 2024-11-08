import java.util.Scanner;

public class assigment1Aloop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (char r = 'a'; r <= 'z'; r++) {
            for (int s = 8; s < s - 2 ; s--) {
                System.out.print(" ");
            }
            System.out.print(r);
            System.out.println();
        } 
    }
}
