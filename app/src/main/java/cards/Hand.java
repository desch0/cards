package desch.cards;

public class Hand {
   
    private ArrayList<Card> cardsDeck() {
        var deck = new ArrayList<Card>();
        for(Card.Suit suit: Card.Suit.values()) {
            for(Card.Rank rank: Card.Rank.values()) {
                deck.add(new Card(rank, suit));
            }
        }
        return deck;
    }

    public Card[] takeHand() {
        var deck = cardsDeck();
        Collections.shuffle(deck);
        
        var hand = new Card[7];
        for(var i=0; i<hand.length; i++)
            hand[i] = deck.get(i);
        return hand;
    }
    //trash method
    public boolean contains(Card[] hand, int value) {
        for(Card card: hand) {
		    if(card.getValue()==value) return true;
		}
		return false;
    }

    public boolean isRoyalStraight(Card[] hand) {
        if(contains(hand, 10) && contains(hand, 11) && contains(hand, 12) && contains(hand, 13) &&contains(hand, 14))
            return true;
  
        return false;
    }

     public boolean isRoyalFlush(Card[] hand) {
        int similar = 1;
        for(int i=0; i<hand.length; i++) {
            similar = 1;
            for(int x=i+1; x<hand.length; x++) {
                if(hand[i].getSuit()==hand[x].getSuit()) similar++;
            }
        }
        if((similar==5) && isRoyalStraight(hand)) return true;
        return false;
    }

    public boolean isFlash(Card[] hand) {
        int similar;
        for(int i=0; i<hand.length; i++) {
            similar = 1;
            for(int x=i+1; x<hand.length; x++) {
                if(hand[i].getSuit()==hand[x].getSuit()) similar++;
            }
            if(similar==5) return true;
        }
        return false;
    }

    public boolean isQuads(Card[] hand) {
        int similar;
        for(int i=0; i<hand.length; i++) {
            similar = 1;
            for(int x=i+1; x<hand.length; x++) {
                if(hand[i].getValue()==hand[x].getValue()) similar++;
            }
            if(similar==4) return true;
        }
        return false;
    }

}