
package basics;

import java.util.Scanner;

import com.itvedant.firstproject.Teststaticmethod;

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
    
    
//    accept discount percent and return total price after discount
    static double calculateFinalTicketFare(double percent) {
    	discount = percent;
    	double amountToPay = bookingPrice - bookingPrice*discount/100;
    	return amountToPay;
    }

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
        
//        method to display the booking information
        static void displayBookingInformation() {

            System.out.println("\n ****");
            System.out.println("Your flight booking details are as follows:");
            System.out.println("Airline Name: " + airlineName);
            System.out.println("From: " + source);
            System.out.println("To: " + destination);
            System.out.println("No of passengers: " + noofPassengers);

            System.out.println("After " + discount + "% discount, The total booking amount is Rs. "
                    + finalTicketPrice);
        }
    

    public static void main(String[] args) {

        setBookingDetails();
        finalTicketPrice = calculateFinalTicketFare(5.0);
        System.out.println("You need to pay rupees Rs. "+finalTicketPrice);
        bookingStatus =true;
        System.out.println("Your booking is confirmed!!");
        displayBookingInformation();

    }
}



