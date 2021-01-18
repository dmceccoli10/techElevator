package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		boolean finished = false;
		while (!finished) {


			//Enter the temperature you wish to convert

			System.out.print("Welcome to Dom's Temperature Converter! Please enter the temperature you wish to convert: ");
			Scanner input = new Scanner(System.in);
			String values = input.nextLine();
			double originalTemperature = Double.parseDouble(values);

			//Is the temperature in Celsius or Fahrenheit?
			System.out.print("Is the temperature in Celsius or Fahrenheit (c/f)? ");
			String originalMeasurement = input.nextLine();

			if (originalMeasurement.equals("f")) {
				double resultInCelsius = ((originalTemperature - 32) / 1.8);
				System.out.format("%.2f F is equal to: %.2f C.\n", originalTemperature, resultInCelsius);
			}
			if (originalMeasurement.equals("c")) {
				double resultInFahrenheit = ((originalTemperature * 1.8) + 32);
				System.out.format("%.2f C is equal to: %.2f F.\n", originalTemperature, resultInFahrenheit);
			}

			//Print the converted temperature
			System.out.println("Are you finished (y/n)?");
			String response = input.nextLine();
			if (response.equals("y")) {
				finished = true;
			}
		}
		System.out.print("Thank you for using Dom's Temperature Converter!");
	}

}
