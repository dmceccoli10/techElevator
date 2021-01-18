package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		boolean finished = false;
		while (!finished) {

			// Prompt user to enter an integer
			System.out.print("Welcome to Dom's Fibonacci's Calculator! Enter an integer to count up to: ");
			Scanner input = new Scanner(System.in);
			String numberStopAt = input.nextLine();
			int n = Integer.parseInt(numberStopAt);

			//Create array to calculate and output Fibonacci sequence
			int fibonacciInitialLength = 100;
			double[] fibonacciSequence = new double[fibonacciInitialLength];
			fibonacciSequence[0] = 0;
			fibonacciSequence[1] = 1;

			for(int i = 2; i < fibonacciSequence.length; i++) {
				fibonacciSequence[i] = (fibonacciSequence[i - 1] + fibonacciSequence[i - 2]);
			}

			for (int i = 0; i < fibonacciSequence.length; i++) {
				if (n > fibonacciSequence[i]) {
					System.out.format("%.0f ", fibonacciSequence[i]);
				} else {
					System.out.println("");
					break;
				}
			}
			//Finish prompt
			System.out.print("Are you finished? (y/n) ");
			String response = input.nextLine();
			if (response.equals("y")) {
				finished = true;
			}
		}
	}

}
