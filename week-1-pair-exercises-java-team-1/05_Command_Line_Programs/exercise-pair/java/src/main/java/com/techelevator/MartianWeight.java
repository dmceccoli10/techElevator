package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {

		// Greet user
		System.out.println("Welcome to the Martian Weight Converter!");

		boolean finished = false;
		while (!finished) {

			// Prompt user to enter a list of earth weights
			System.out.print("Please enter a list of earth weights, separated by spaces: ");
			Scanner input = new Scanner(System.in);
			String values = input.nextLine();
			String[] earthWeightArray = values.split(" ");

			// Calculate the individual Martian weights
			double[] earthWeightDoubles = new double[earthWeightArray.length];
			for (int i = 0; i < earthWeightArray.length; i++) {
				earthWeightDoubles[i] = Double.parseDouble(earthWeightArray[i]);
			}
			double[] martianWeights = new double[earthWeightDoubles.length];
			for (int i = 0; i < earthWeightDoubles.length; i++) {
				martianWeights[i] = earthWeightDoubles[i] * 0.378;
			}
			// Print out each value converted into Martian Weights
			for (int i = 0; i < martianWeights.length; i++) {
				System.out.format("%.2f lbs. on earth, is %.2f lbs. on Mars.\n", earthWeightDoubles[i], martianWeights[i]);
			}
			System.out.print("Do you have more weights to enter (y/n)?: ");

			String response = input.nextLine();
			if (response.equals("n")) {
				finished = true;
			}
		}
		System.out.println("Thank you for using the Martian Weight Converter!");



		}



	}

