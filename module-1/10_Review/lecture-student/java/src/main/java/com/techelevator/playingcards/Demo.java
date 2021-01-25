package com.techelevator.playingcards;


import java.util.HashMap;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {

        Card myCard = new Card("Jack", "Clubs");

        myCard.flip();

        int v = myCard.getValue();
        System.out.println(v);

        System.out.println(Card.getValueForRank("Ace"));

        char c = 'X';
        String s = "" + c;
        //String s = String.valueOf(c);
        //s = String.valueOf(c);

        System.out.println("This is a test".replace("test", "review"));


        Map<String, Card> dealtCards = new HashMap<>();
        Deck deck = new Deck();
        deck.shuffle();
        dealtCards.put("Vera", deck.drawCard());
        dealtCards.put("Max", deck.drawCard());
        dealtCards.put("Dom", deck.drawCard());

        for (Map.Entry<String, Card> entry : dealtCards.entrySet()) {
            Card currentCard = entry.getValue();
            currentCard.flip();
            System.out.println(entry.getKey() + " has the card " + entry.getValue().getDescription());

            //Helper Boolean
            String rank = currentCard.getRank();
            boolean hasFaceCard = rank.equals("Jack") || rank.equals("Queen") || rank.equals("King");
            if (hasFaceCard) {
                System.out.println(entry.getKey() + " has a face card!");
            }

        }


    }
}
