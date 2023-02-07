package desch.cards;

public class Card {

    private Suit suit;
    private Rank rank;
    private String name;

    public Card(Rank rank, Suit suit) {
        this.suit = suit;
        this.name = rank.getName();
        this.rank = rank;
    }

    public String toString() {
        var result = "";
        switch(suit) {
            case CLUBS: 
                result += "♣ ";
                break;
            case SPADES:
                result += "♠ ";
                break;
            case HEARTS:
                result += "♥ ";
                break;
            case DIAMONDS:
                result += "♦ ";
                break;

        }
        if(rank.getValue()>=11)
            return result + rank.getName();
        return result + rank.getValue();
    }

    public Suit getSuit() {
        return this.suit;
    }
    public int getValue() {
        return rank.getValue();
    }

    public Rank getRank() {
        return this.rank;
    }

    public enum Rank {
        TWO(2, "Two"), 
        THREE(3, "Three"),
        FOUR(4, "Four"),
        FIVE(5, "Five"),
        SIX(6, "Six"),
        SEVEN(7, "Seven"),
        EIGHT(8, "Eight"),
        NINE(9, "NINE"),
        TEN(10, "TEN"),
        JACK(11, "Jack"),
        QUEEN(12, "Queen"),
        KING(13, "King"),
        ACE(14, "Ace");

        private int value;
        private String name;

        private Rank(int v, String name) {
            this.value = v;
            this.name = name;
        }

        public int getValue() {
            return this.value;
        }
        public String getName() {
            return this.name;
        }
    }

    public enum Suit {
        CLUBS("Clubs"),
        SPADES("Spades"),
        HEARTS("Hearts"),
        DIAMONDS("Diamonds");

        private String name;

        private Suit(final String name) {
            this.name = name;
        }

        public String  getName() {
            return this.name;
        }
    }

}