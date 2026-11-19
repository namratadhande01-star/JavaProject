package com.itvedant.firstproject;

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
//    	discount = percent;
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
//        if(noofPassengers > 0) {
//
//        bookingPrice = noofPassengers * ticketPrice;
//
//        bookingStatus = true;
//
//        System.out.println("Thank you for providing details.");
//
//        
//    }
//        else {
//			System.err.println("Your booking cannot be provcessed, as number of passengers must be 1 or more");
//			bookingPrice = noofPassengers * ticketPrice;
//		
//		}
//        sc.close();
//    }
        
//        Switch case
        if(noofPassengers > 0 && noofPassengers <=5) {
     	   bookingPrice = noofPassengers *  ticketPrice;
     	   switch(passengerCategory)
     	   {
     	   case "regular":
     		   discount = 5.0;
     		   break;
     	   case "student":
     		   discount = 10.0;
     		   break;
     	   case "armed forces":
     		   discount = 20.0;
     		   break;
     		   default :
     			   System.err.println("please provide valid category");
     			   
     	     	   }
     	   bookingStatus = true;
        }
         else {
 			System.err.println("Your booking cannot be processes,as number of passengers must be 1 to 5");
 			bookingPrice = 0;
 		}
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
//        if(bookingStatus) {
        System.out.println("You need to pay rupees Rs. "+finalTicketPrice);
        bookingStatus =true;
        System.out.println("Your booking is confirmed!!");
        displayBookingInformation();
//        }
    }
}
