package com.itvedant.firstproject;


import java.util.Scanner;

class ArrayFlightBooking {

    public static void main(String[] args) {

        String source;
        String destination;
        Byte noOfPassengers;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the Flight Booking details:");
        System.out.println("Enter the source, destination and number of passengers");

        source = sc.next();
        destination = sc.next();
        noOfPassengers = sc.nextByte();

        // Declaring String array to store passenger names
        String[] passengerNames = new String[noOfPassengers];

        // Declaring int array to store passenger ages
        int[] passengerAge = new int[noOfPassengers];

        System.out.println("Enter the " + noOfPassengers + " passenger names and age");

        // Accept passenger names and ages using for loop
        for (byte i = 0; i < passengerNames.length; i++) {

            System.out.println("Enter passenger " + (i + 1) + " name:");
            passengerNames[i] = sc.next();
            passengerAge[i] = sc.nextInt();

        }

        System.out.println("Following passengers are travelling from " + source + " to " + destination);

        // Displaying passenger names and ages
        for (byte i = 0; i < noOfPassengers; i++) {

            System.out.println("Passenger name: " + passengerNames[i] + ", Age: " + passengerAge[i]);

        }

        sc.close();

    }
}

