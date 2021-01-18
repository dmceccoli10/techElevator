package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		boolean finished = false;
		while (!finished) {

			// Enter the measurement you wish to convert
			System.out.print("Welcome to Dom's Measurement Converter! Please enter the measurement you wish to convert: ");
			Scanner input = new Scanner(System.in);
			String values = input.nextLine();
			double originalLength = Double.parseDouble(values);

			// Is the measurement in feet or meters?
			System.out.print("Is the measurement in meters or feet (m/f)? ");
			String originalUnit = input.nextLine();

			// Calculate and Print the converted measurement

			if (originalUnit.equals("m")) {
				double resultInFeet = ((originalLength * 3.2808399));
				System.out.format("%.2f m is equal to: %.2f feet.\n", originalLength, resultInFeet);
			}
			if (originalUnit.equals("f")) {
				double resultInMeters = ((originalLength * 0.3048));
				System.out.format("%.2f feet is equal to: %.2f meters.\n", originalLength, resultInMeters);
			}

			// Are you finished?
			System.out.println("Are you finished (y/n)?");
			String response = input.next();
			if (response.equals("y")) {
				finished = true;
			}
		}
			System.out.print("Thank you for using Dom's Measurement Converter! Come back soon!");
	}

}
