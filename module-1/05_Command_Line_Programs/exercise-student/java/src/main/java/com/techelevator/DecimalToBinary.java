package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		boolean finished = false;
		while (!finished) {

			//Welcome and enter decimal values to be converted to binary
			System.out.println("Welcome to Dom's Decimal to Binary Converter!");
			System.out.print("Enter a series of decimal values, separated by spaces, to be converted: ");
			Scanner input = new Scanner(System.in);
			String decimalValues = input.nextLine();
			String[] decimalValuesSeparated = decimalValues.split(" ");

			//Calculate and output binary values
			for (int i = 0; i < decimalValuesSeparated.length; i++) {
				int numberEntered = Integer.parseInt(decimalValuesSeparated[i]);
				String binaryNumber = Integer.toBinaryString(numberEntered);
				System.out.println(numberEntered + " is equal to " + binaryNumber + " in binary!");
			}
			System.out.print("Are you finished? (y/n) ");
			String response = input.nextLine();
			if (response.equals("y")) {
				finished = true;
			}
		}
		System.out.print("Thanks for using Dom's Binary Converter! Enjoy your day.");
	}


	}

