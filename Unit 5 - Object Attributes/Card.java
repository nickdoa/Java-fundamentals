
/**
 * Card
 *
 * @author Nick Choi
 * @version 3/31/23
 */

import java.util.Random;

public class Card {
    private int value;
    private String cardFace;

    /**
     * Default constructor
     * This constructor should assign a random value [2-11] to value.
     * Initialize cardFace with the value + the call from helper method makeCardSuit()
     */
    public String getCardFace() {
        return this.cardFace;
    }
    public Card() {
        Random rand = new Random();
        this.value = rand.nextInt(10) + 2;
        this.cardFace = "[" + this.value + makeCardSuit() + "]";
    }
    /**
     * makeCardSuit()
     * This method returns a random suit string for the card face.
     * Make a random number [1-4] and return either "H", "D", "C", "S" or the unicode values below
     * Heart char      ""+'\u2665'
     * Diamond char    ""+'\u2666'
     * Club char       "" +'\u2663'
     * Spade char      "" +'\u2660'
     */
    private String makeCardSuit() {
        Random rand = new Random();
        int suitIndex = rand.nextInt(4) + 1;

        switch (suitIndex) {
            case 1:
                return "" + '\u2665'; // Heart symbol
            case 2:
                return "" + '\u2666'; // Diamond symbol
            case 3:
                return "" + '\u2663'; // Club symbol
            case 4:
                return "" + '\u2660'; // Spade symbolC
            default:
                return "";
        }
    }
    public int getValue() {
        return this.value;
    }
    public String toString() {
        return this.cardFace;
    }
}