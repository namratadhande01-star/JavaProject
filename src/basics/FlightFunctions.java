
package basics;

import java.util.Scanner;

public class FlightFunctions {

    static String source;
    static String destination;
    static String airlineName;

    static byte noofPassengers;

    static double ticketPrice = 3499.50;
    static double bookingPrice, finalTicketPrice;

    static boolean bookingStatus = false;

    static String passengerCategory;
    static double discount = 0.0;

    // Method to accept booking details
    static void setBookingDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the airline name, Source, Destination");

        airlineName = sc.next();
        source = sc.next();
        destination = sc.next();

        System.out.println("The ticket price is Rs. " + ticketPrice);

        System.out.println("Please enter no of passengers");
        noofPassengers = sc.nextByte();

        System.out.println("Please enter the passenger category as 'regular' or 'student' or 'armed forces'");

        sc.nextLine();
        passengerCategory = sc.nextLine();

        bookingPrice = noofPassengers * ticketPrice;

        bookingStatus = true;

        System.out.println("Thank you for providing details.");

        sc.close();
    }

    public static void main(String[] args) {

        setBookingDetails();

    }
}



