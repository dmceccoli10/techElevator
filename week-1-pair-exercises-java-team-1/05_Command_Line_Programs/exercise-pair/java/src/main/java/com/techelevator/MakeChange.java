package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		System.out.println("Welcome to Change Calculator!");

		boolean finished = false;
		while(!finished) {

			//prompt user to enter the total of the bill
			System.out.print("Please enter the total cost of the bill: ");
			Scanner input = new Scanner(System.in);
			String value = input.nextLine();
			double totalBill = Double.parseDouble(value);

			//prompt user to enter the cash tendered
			System.out.print("Please enter the amount of cash tendered: ");
			String tendered = input.nextLine();
			double cashTendered = Double.parseDouble(tendered);

			//calculate the change issued
			double change = cashTendered - totalBill;

			//display change issued
			System.out.format("The change for this transaction is: $%.2f.\n", change);

			System.out.print("Are you all done (y/n)? ");
			String response = input.nextLine();
			if (response.equals("y")) {
				finished = true;
			}
		}
		System.out.println("Thank you for using Change Calculator! Come back soon!");

	}

}
