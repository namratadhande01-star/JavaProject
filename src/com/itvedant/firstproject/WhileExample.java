package com.itvedant.firstproject;
import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of passengers: ");
        int n = sc.nextInt();
        
        int i = 1;
         while(i <= n) {
         System.out.println("\nEnter details for passsneger" +i);
         
         System.out.println("Enter Name: ");
         String name = sc.next();
         
         System.out.println("Enter Age: ");
         int age =  sc.nextInt();
         
//         printing details
         System.out.println("\npassenger " + i + "Deails:");
         System.out.println("Name: "+name);
         System.out.println("Age: "+age);
         i++;
	}
	sc.close();
}
}
