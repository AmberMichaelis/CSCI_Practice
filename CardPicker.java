public class CardPicker {
    public static void main(String[] args) {
        String cardName = "";
        int card = (int) (Math.round(Math.random() * 12) + 1);
        if (card == 1) {
            cardName = "Ace";
        } else if (card == 11) {
            cardName = "Jack";
        } else if (card == 12) {
            cardName = "Queen";
        } else if (card == 13) {
            cardName = "King";
        } else {
            cardName = Integer.toString(card);
        }
        String suitName = "";
        int suit = (int) (Math.round(Math.random() * 5));
        if (suit == 0) {
            suitName = "Hearts";
        } else if (suit == 1) {
            suitName = "Diamonds";
        } else if (suit == 2) {
            suitName = "Clubs";
        } else {
            suitName = "Spades";
        }
        System.out.println("You picked " + cardName + " of " + suitName);
    }

}
