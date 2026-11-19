package com.itvedant.firstproject;
import java.util.Scanner;

import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char choice;

        do {
            System.out.println("Enter Name: ");
            String name = sc.next();

            System.out.println("Enter Age: ");
            int age = sc.nextInt();

            System.out.println("Details saved!");

            System.out.println("Do you want to add more passengers? (y/n)");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you!");

        sc.close();
    }
}

