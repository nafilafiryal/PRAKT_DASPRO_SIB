public class nyoba {
        public static void main(String[] args) {
            int rows = 5;
            char startChar = 'a';
    
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i ; j++) {
                    System.out.print(" ");
                    
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print((char) (startChar + i + j - 2));
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("  ");
                }
                System.out.println();
            }
        }
    
}
