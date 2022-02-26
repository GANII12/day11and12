package assignment;

public class DeckOfCards {
    public static void main(String[] args) {

    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String [] deck = new String[52];

    // Initialize cards
    for (int i = 0; i < deck.length; i++) {
        deck[i] = ranks[i%13] + " " + suits[i/13];
    }

    // Shuffle the cards
    for (int i = 0; i < deck.length; i++) {
        int index = (int)(Math.random() * deck.length);
        String temp = deck[i];
        deck[i] = deck[index];
        deck[index] = temp;
    }

        int currentDeckCard = 0;
        for (int player = 1; player < 4; player++) {
            System.out.println("current player : " + player);
            for (int card = 1; card <= 9; card++) {
                System.out.println(deck[currentDeckCard]);
                currentDeckCard++;
            }
        }
    }

}
