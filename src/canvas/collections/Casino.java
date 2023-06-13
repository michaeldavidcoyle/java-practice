package canvas.collections;

// Stack
// class in the Java Collections API
// first-in/last-out (FILO)
// push to the tail
// pop from the tail
// allows duplicates
// preserves order insertion

import java.util.Stack;

public class Casino {
    public static void main(String[] args) {
        Stack<Card> deck = new Stack<>();
        deck.push(new Card("A of Spades"));
        deck.push(new Card("K of Diamonds"));
        deck.push(new Card("Q of Hearts"));

        Card drawnCard = deck.pop();
        System.out.println(drawnCard.value); // Q of Hearts (last-in/first-out)

        Card peekABoo = deck.peek(); // view but not remove next card on stack
        System.out.println(peekABoo.value);
    }
}

class Card {
    String value;

    public Card(String value) {
        this.value =value;
    }
}