import java.util.Scanner;

public class porseni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sport1 = "Badminton";
        String sport2 = "Table Tennis";
        String sport3 = "Basketball";
        String sport4 = "Volleyball";

        int numAthletesPerSport = 5;

        System.out.println("\nEach Sport: " + sport1);
        for (int i = 1; i <= numAthletesPerSport; i++) {
            System.out.println("Athletes " + i + ":");
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Polytechnic: ");
            String polytechnic = input.next();
            input.nextLine();
            System.out.println("- " + name + " (" + polytechnic + ")");
            
            
        }
        System.out.println("\nEach Sport: " + sport2);
        for (int i = 1; i <= numAthletesPerSport; i++) {
            System.out.println("Athletes " + i + ":");
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Polytechnic: ");
            String polytechnic = input.nextLine();
            System.out.println("- " + name + " (" + polytechnic + ")");
            
        }
        System.out.println("\nEach Sport: " + sport3);
        for (int i = 1; i <= numAthletesPerSport; i++) {
            System.out.println("Athletes " + i + ":");
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Polytechnic: ");
            String polytechnic = input.nextLine();
            System.out.println("- " + name + " (" + polytechnic + ")");
            
        }
        System.out.println("\nEach Sport: " + sport4);
        for (int i = 1; i <= numAthletesPerSport; i++) {
            System.out.println("Athletes " + i + ":");
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Polytechnic: ");
            String polytechnic = input.nextLine();
            System.out.println("- " + name + " (" + polytechnic + ")");
            
        }
        
        

    }
}
