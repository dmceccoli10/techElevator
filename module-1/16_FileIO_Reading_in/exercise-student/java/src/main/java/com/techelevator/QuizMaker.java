package com.techelevator;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the fully qualified name of the file to read in for quiz questions");
		String fileName = input.nextLine();
		Path myPath = Path.of(fileName);
		QuizQuestion question1 = new QuizQuestion();
		//Correct Answer Count
		int correctAnswerCount = 0;
		//Number of Questions to add to
		int numberOfQuestions = 0;
		try (Scanner scan = new Scanner(myPath)) {
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] lineArray = line.split("\\|");
				for (int i = 1; i < lineArray.length; i++){
					if(lineArray[i].contains("*")) {
						lineArray[i] = lineArray[i].replace("*", " ");
						question1.setCorrectAnswer(i);
					}
				}
				question1.setQuestion(lineArray[0]);
				question1.setAnswer1(lineArray[1]);
				question1.setAnswer2(lineArray[2]);
				question1.setAnswer3(lineArray[3]);
				question1.setAnswer4(lineArray[4]);
				System.out.println(question1.getQuestion());
				System.out.println("1. " + question1.getAnswer1());
				System.out.println("2. " + question1.getAnswer2());
				System.out.println("3. " + question1.getAnswer3());
				System.out.println("4. " + question1.getAnswer4());
				System.out.println("\nYour answer: ");
				//User enters answer
				String userAnswer = input.nextLine();
				int userInt = Integer.parseInt(userAnswer);
				//if user answer is correct
				if (userInt == question1.getCorrectAnswer()) {
					System.out.println("Bingo! Nice work! ");
					correctAnswerCount++;
				//if user answer is incorrect
				} else {
					System.out.println("D'oh! Not that one! ");
				}
				numberOfQuestions++;
			}
			//Exception
		}	catch (IOException e) {
			System.out.println("ERROR");
		}
		//Final score tallying and output
		System.out.println("Thanks for playing! You got " + correctAnswerCount + " answer(s) correct out of " + numberOfQuestions + " questions asked.");
	}

}
