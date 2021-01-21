package com.techelevator;


public class Lecture {

    public static void main(String[] args) {

        Card firstCard = new Card();
        Card secondCard = new Card();
        System.out.println(firstCard); //prints out reference to card

        firstCard.setSuit("Clubs");
        secondCard.setSuit("Diamonds");
        secondCard.setRank("Nine");
        System.out.println(firstCard.getSuit());
        System.out.println(secondCard.getSuit());
        System.out.println(secondCard.getRank());

    }
}
