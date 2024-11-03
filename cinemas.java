import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class cinemas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ticket, buyTicket, ticketPrice = 50000, discount, totalPriceTicket, totalTicketSalePrice;
        int totalTicketSold = 0;
        do {
            System.out.print("Enter number you buy ticket: ");
            buyTicket = input.nextInt();
            if (buyTicket < 0) {
            System.out.println("Your number is invalid!");
            System.out.println("Please enter positive number!");
            continue;
              
            }
            
            if (buyTicket > 10) {
                ticket = ticketPrice * buyTicket;
                discount = 0.15 * ticket;
                totalPriceTicket = ticket - discount;
                System.out.println("Get discount 15%. You pay Rp " + totalPriceTicket);
            } else if (buyTicket > 4) {
                ticket = ticketPrice * buyTicket;
                discount = 0.1 * ticket;
                totalPriceTicket = ticket - discount;
                System.out.print("Get discount 10%. " +"You pay Rp " + totalPriceTicket  );
            }
            totalTicketSold +=  buyTicket;
            System.out.println("Total ticket sold in one day: " + totalTicketSold);
            
            
        } while (buyTicket++ <= 0);
        
    }
}
