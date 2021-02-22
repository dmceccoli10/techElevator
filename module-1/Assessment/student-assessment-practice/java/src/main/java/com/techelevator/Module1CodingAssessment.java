package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.nio.channels.ScatteringByteChannel;
import java.nio.file.Path;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		FlowerShopOrder domsOrder = new FlowerShopOrder("standard", 0);
		System.out.println("Dom's order: " + domsOrder.getBouquetType() + " " + domsOrder.getNumberOfRoses() + " " + domsOrder.getSubtotal());

		domsOrder = new FlowerShopOrder("fancy", 12);
		System.out.println("Dom's order: " + domsOrder.getBouquetType() + " " + domsOrder.getNumberOfRoses() + " " + domsOrder.getSubtotal());

		BigDecimal domDeliveryTotal = domsOrder.calcDeliveryTotal(true, "20000");
		System.out.println("same day delivery to 20000 is " + domDeliveryTotal);

		FlowerShopOrder newOrder = new FlowerShopOrder("president's day", 3);
		System.out.println(newOrder);

		//Open and read in the CSV file, create a FSO for each one and then print sum of all subtotals
		System.out.println("***** READ FROM FILE *****");
		BigDecimal sumOfAllSubtotals = BigDecimal.ZERO;

		Path.of("data-files/FlowerInput.csv");
		File text = new File("data-files/FlowerInput.csv");
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(text);
			while (fileScanner.hasNext()) {
				String line = fileScanner.nextLine();
				String[] lineAr = line.split(",");
				int numRoses = Integer.parseInt(lineAr[1]);
				FlowerShopOrder order = new FlowerShopOrder(lineAr[0], numRoses);
				System.out.println(order.getBouquetType() + " " + order.getNumberOfRoses() + " " + order.getSubtotal());
				sumOfAllSubtotals = sumOfAllSubtotals.add(order.getSubtotal());
			}
			System.out.println("Your total of subtotals: " + sumOfAllSubtotals);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
