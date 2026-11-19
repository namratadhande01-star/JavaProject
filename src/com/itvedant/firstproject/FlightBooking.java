package com.itvedant.firstproject;

import java.util.Scanner;

public class FlightBooking {

	public static void main(String[] args) {
		Scanner Sc =  new Scanner(System.in);
		
//		Taking Inputs
		System.out.println("Enter Passenger Name: ");
		String name = Sc.nextLine();
		
		System.out.println("Enter age: ");
		int age = Sc.nextInt();
		
		System.out.println("Enter Number of Tickets: ");
		int tickets = Sc.nextInt();
		
		System.out.println("Enter Price per tickets; ");
		double price = Sc.nextDouble();
		
		System.out.println("Do you want food? (True/False):");
		boolean food = Sc.nextBoolean();



//Arithmetic operator
double totalFare = tickets*price;

//Assignment operator
totalFare+=200;

//Ternary operator
double discount = (age<12 || age>60)? totalFare*0.10:0;

//Applying Discount
totalFare-=discount;

//Logical operator
boolean offerEligible = (tickets >= 5 && age>=18);

//Conditional expression
double foodCost = food ? tickets*150:0;
totalFare += foodCost;

//Modulus operator
if(tickets % 2 == 0) {
	System.err.println("Special offer: Even number of tickets booked!");
}


//Final output
System.out.println("\n ----- Booking Details -----");
System.out.println("Passenger name:  "+name);
System.out.println("Age: "+age);
System.out.println("Tickets: "+tickets);
System.out.println("Price per Ticket: "+price);
System.out.println("Food included: "+food);
System.out.println("Dicount Applied: "+discount);
System.out.println("Offer Eligible: "+offerEligible);
System.out.println("Total Amount to pay: "+totalFare);
Sc.close();
	}
}