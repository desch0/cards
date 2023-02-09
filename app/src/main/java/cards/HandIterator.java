package cards;

import java.util.Iterator;

public class HandIterator implements Iterator<Card>{

    private Card[] hand;
    private int current=0;

    public HandIterator(Card[] getHand) {
        hand = getHand;
    }

    @Override
    public boolean hasNext() {
        if(current<hand.length) return true;
        return false;
    }

    @Override
    public Card next() {
        if(hasNext()) {
            Card result = hand[current];
            current++;
            return result;
        }
        return null;
    }

}