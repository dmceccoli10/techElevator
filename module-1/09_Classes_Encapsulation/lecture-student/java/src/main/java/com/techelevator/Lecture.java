package com.techelevator;


public class Lecture {

    public static void main(String[] args) {

        Card firstCard = new Card();
        Card secondCard = new Card();
        System.out.println(firstCard); //prints out reference to card


        System.out.println(firstCard.getSuit());
        System.out.println(secondCard.getSuit());
        System.out.println(secondCard.getRank());
        System.out.println(secondCard.isFaceUp());
        System.out.println(secondCard.getDescription());
        System.out.println(firstCard.getDescription());
        secondCard.setFaceUp(true);
        System.out.println(secondCard.getDescription() + " has a value of " + secondCard.getValue());

        Card thirdCard = new Card("Queen", "Hearts");
        System.out.println(thirdCard.getDescription());
        thirdCard.flip();
        System.out.println(thirdCard.getDescription());
        System.out.println(thirdCard.getValue());

        if (thirdCard.isHigherThan(secondCard)) {
            System.out.println("Third Card is Higher");
        } else {
            System.out.println("Second Card is Higher");
        }

        System.out.println(Card.shape);

        Deck myDeck = new Deck();
        myDeck.shuffle();
        Card firstPick = myDeck.drawCard();
        firstPick.flip();
        System.out.println(firstPick.getDescription());

        while (myDeck.getCardCount() > 0) {
            Card pick = myDeck.drawCard();
            pick.flip();
            System.out.println(pick.getDescription());
        }
    }
}
