package blackJack;

import shuffler.Card;
import shuffler.Deck;

import java.util.ArrayList;

public class BlackJackHand extends Deck {

    public int handValues;
    public int cnt=0;
    boolean ace = false;

    public BlackJackHand(){
        super();
    }

    public int getValue(){
        for(int i=0; i<getCards().size(); i++){
            handValues += ((BlackJackCard) getCards().get(i)).getValue();
            ace = ((BlackJackCard) getCards().get(i)).isAce();
            cnt++;
        }

        handValues = (ace && handValues > 21) ? handValues - 10 : handValues;

        return handValues;
    }

    public boolean isBusted(){
        if(handValues >21){
            return true;
        } else {
            return false;
        }
    }

    public boolean isBlackjack(){
        if(handValues == 21 && cnt == 2){
            return true;
        } else {
            return false;
        }
    }
}
