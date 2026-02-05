import java.util.*;

class Ticket {
    String source;
    String destination;
    String journeyDate;
    String travelClass;
    int seats;

    Ticket(String source, String destination, String journeyDate, String travelClass, int seats) {
        this.source = source;
        this.destination = destination;
        this.journeyDate = journeyDate;
        this.travelClass = travelClass;
        this.seats = seats;
    }

    void displayTicket() {
        System.out.println("\n----- Ticket Details -----");
        System.out.println("From: " + source);
        System.out.println("To: " + destination);
        System.out.println("Date: " + journeyDate);
        System.out.println("Class: " + travelClass);
        System.out.println("Seats: " + seats);
        System.out.println("Status: Confirmed");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Source Station: ");
        String source = sc.nextLine();

        System.out.print("Enter Destination Station: ");
        String destination = sc.nextLine();

        System.out.print("Enter Journey Date (DD-MM-YYYY): ");
        String date = sc.nextLine();

        System.out.print("Enter Class (First / Second): ");
        String travelClass = sc.nextLine();

        System.out.print("Enter Number of Seats: ");
        int seats = sc.nextInt();

        Ticket ticket = new Ticket(source, destination, date, travelClass, seats);
        ticket.displayTicket();

        sc.close();
    }
}
