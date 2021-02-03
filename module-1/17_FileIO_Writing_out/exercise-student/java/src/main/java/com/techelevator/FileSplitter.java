package com.techelevator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {

	//Ask the user what file they want split
	Scanner userInput = new Scanner(System.in);

	System.out.print("Please enter a file name to split: ");
	String inputFileName = userInput.nextLine();
	Path path = Path.of(inputFileName);

	//Ask user how many lines of text in each of the split files
	System.out.print("How many lines of text would you like in each of the new files? ");
	String numberOfLines = userInput.nextLine();
	int linesPerFile =	Integer.parseInt(numberOfLines);

	//Count all of the lines of text in input file
	int sumOfLines = 0;
	List<String> lineContent = new ArrayList<>();
	try (Scanner fileScanner = new Scanner(path)) {
		while (fileScanner.hasNextLine()) {
			lineContent.add(fileScanner.nextLine());
			sumOfLines++;
		}
	} catch (IOException e) {
		System.out.println("Couldn't find path!");
	} System.out.println("The file has " + sumOfLines + " total lines of text.");

	//equation: TotalNumberOfInputLines / number of lines in each new file = number of new files
		int numberOfNewFiles = 0;
	//numberOfNewFiles = (sumOfLines / linesPerFile);
	if (sumOfLines % linesPerFile == 0) {
		numberOfNewFiles = sumOfLines / linesPerFile;
	} else {
		numberOfNewFiles = (sumOfLines / linesPerFile) + 1;
	}

	System.out.println("For a " + sumOfLines + " line input file \"" + inputFileName + "\", this produces " + numberOfNewFiles + " output files." );
	System.out.println("\n**GENERATING OUTPUT**\n");

	String [] fileNameParts = inputFileName.split("\\.");

	for (int i = 1; i <= numberOfNewFiles; i++) {
		String sourceFileName = fileNameParts[0] + "-" + i + "." +fileNameParts[1];
		try(PrintWriter destinationWriter = new PrintWriter(sourceFileName)) {
			System.out.println("Generating " + sourceFileName);
			try{
				for(int suffix = 0; suffix < linesPerFile; suffix++){
					destinationWriter.println(lineContent.remove(0));
				}
			} catch (IndexOutOfBoundsException e) {
				break;
			}
		} catch (FileNotFoundException e) {
			System.out.println("File was not found");
		}
	}




	//Split source file into number of files specified in equation



		//Manipulate new files name format
	//try(PrintWriter destinationWriter = new PrintWriter(inputFileName)) {
	//
	//} catch (FileNotFoundException e) {
	//	e.printStackTrace();
	//}


	System.out.println("Thanks for using the file splitter");
	}

}




