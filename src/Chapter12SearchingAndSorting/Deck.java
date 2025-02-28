package Chapter12SearchingAndSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> deck;

    public String toString() {
        String result = "[";
        for (int i = 0; i < deck.size() - 1; i++) {
            result += deck.get(i).toString() + ", ";
        }
        result += deck.get(deck.size() - 1).toString() + "]";
        return result;
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public void sort() {
        Collections.sort(deck);
    }


    public Deck() {
        deck = new ArrayList<>();
        for (int i = 1; i <= 4 ; i++) { // loop through the suit
            for (int j = 2; j <= 14; j++) {
                Card card = new Card(i,j);
                deck.add(card);
            }
        }
    }
}
