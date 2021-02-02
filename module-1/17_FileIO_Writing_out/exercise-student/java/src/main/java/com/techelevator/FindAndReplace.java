package com.techelevator;

import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("What is the search word? ");
        String inputWord = userInput.nextLine();

        System.out.print("What is the replacement word? ");
        String replacementWord = userInput.nextLine();

        System.out.print("What is the source file? ");
        String sourceFile = userInput.nextLine();

        System.out.print("What is the destination file? ");
        String destFile = userInput.nextLine();

    }

}
