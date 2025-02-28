package Chapter12SearchingAndSorting;

import java.util.Collections;

public class CardGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck);
        deck.shuffle();
        System.out.println(deck);
        deck.sort();
        System.out.println(deck);

    }
}
