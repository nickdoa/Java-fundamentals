
/**
 * Hand
 *
 * @author Nick
 * @version 3/31/23
 */

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private String name;
    private List<Card> cardsInHand;
    private int handTotal;
    private boolean bust;
    private boolean stay;

    public Hand(String name) {
        this.name = name;
        this.cardsInHand = new ArrayList<>();
        this.handTotal = 0;
        this.bust = false;
        this.stay = false;
    }
    public String getName() {
        return this.name;
    }
    public List<Card> getCardsInHand() {
        return this.cardsInHand;
    } 
    public int handTotal() {
        return this.handTotal;
    }
    public boolean getBust() {
        return this.bust;
    }
    public boolean getStay() {
        return this.stay;
    }
    public void hit() {
        Card card = new Card();
        this.cardsInHand.add(card);
        this.handTotal += card.getValue();
        checkForBust();
    }    
    private void checkForBust() {
        if (this.handTotal > 21) {
            this.bust = true;
        }
    }
    public void stay() {
        this.stay = true;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : this.cardsInHand) {
            sb.append(card.getCardFace() + " ");
        }
        return sb.toString().trim();
    }
}
