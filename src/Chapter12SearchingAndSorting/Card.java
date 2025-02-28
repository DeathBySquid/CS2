package Chapter12SearchingAndSorting;

public class Card implements Comparable<Card> {
    int suit; // 1: Clubs, 2: Diamonds, 3: Hearts, 4: Spades
    int rank; // 2-10, 11: J, 12: Q, 13: K, 14:A

    public String toString() {
        return rank + ":" + suit;
    }

    public int compareTo(Card other) {
        if (this.rank == other.rank) {
            return this.suit - other.suit;
        } else {
            return this.rank - other.rank;
        }
    }

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }
}
