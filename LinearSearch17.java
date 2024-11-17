import java.util.Scanner;

public class LinearSearch17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numElements, key, result = 0;
        System.out.print("Enter the number of array elements: ");
        numElements = input.nextInt();
        int arrayElements[] = new int[numElements];
        int i;
        for ( i = 0; i < numElements; i++) {
            System.out.print("Enter the array element " + i + ": ");
            arrayElements[i] = input.nextInt();
        }
        System.out.print("Enter the key you want to search for: ");
        key = input.nextInt();
        for (int j = 0; j < arrayElements.length; j++) {
            if (key == arrayElements[j]) {
                result = j;
                System.out.println("The key in the array is located at index position " + result);
                break;
            } else {
                System.out.println("Key not found");
                break;
            }
        }
    }
}