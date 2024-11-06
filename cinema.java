import java.util.Scanner;
public class cinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalTicketsSold = 0;
        double ticketPrice = 50000;
        double totalTicketSalesPrice = 0, buyTicket, ticketCost, discount, totalPrice;

        while (true) {
            System.out.print("Enter number of tickets to buy (negative number to exit): ");
            buyTicket = input.nextDouble();

            if (buyTicket < 0) {
                break;
            }

            if (buyTicket <= 0) {
                System.out.println("Invalid number! Please enter a positive number.");
                continue;
            }

            ticketCost = ticketPrice * buyTicket;
            discount = 0;

            if (buyTicket > 10) {
                discount = 0.15 * ticketCost;
                System.out.println("Get discount 15%.");
            } else if (buyTicket > 4) {
                discount = 0.10 * ticketCost;
                System.out.println("Get discount 10%.");
            }
            totalPrice = ticketCost - discount;
            totalTicketsSold += buyTicket;
            totalTicketSalesPrice += totalPrice;

            System.out.printf("You pay Rp %.2f for %.0f tickets.\n", totalPrice, buyTicket);
            System.out.println("Total tickets sold so far: " + totalTicketsSold);
            System.out.printf("Total ticket sales price so far: Rp %.2f\n", totalTicketSalesPrice);
        }
        System.out.println("Total tickets sold in one day: " + totalTicketsSold);
        System.out.printf("Total ticket sales price for the day: Rp %.2f\n", totalTicketSalesPrice);

    }
}
