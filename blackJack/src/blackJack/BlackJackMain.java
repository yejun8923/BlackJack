package blackJack;

import shuffler.Card;
import shuffler.Deck;

public class BlackJackMain {
    public static void main(String[] args) {
        /*
        BlackJackCard card1 = new BlackJackCard(1,1);
        BlackJackCard card2 = new BlackJackCard(2,6);
        BlackJackCard card3 = new BlackJackCard(4,13);

        System.out.println(card1.getValue());
        System.out.println(card1.isAce());
        System.out.println("-----------");
        System.out.println(card2.getValue());
        System.out.println(card2.isAce());
        System.out.println("-----------");
        System.out.println(card3.getValue());
        System.out.println(card3.isAce());
        */

        BlackJackHand hand1 = new BlackJackHand();
        hand1.addCard(new BlackJackCard(3, 1));
        hand1.addCard(new BlackJackCard(4, 11));
        System.out.println(hand1.getValue());
        System.out.println(hand1.isBlackjack());
        System.out.println(hand1.isBusted());

        BlackJackHand hand2 = new BlackJackHand();
        hand2.addCard(new BlackJackCard(1, 4));
        hand2.addCard(new BlackJackCard(2, 8));
        hand2.addCard(new BlackJackCard(2, 9));
        System.out.println(hand2.getValue());
        System.out.println(hand2.isBlackjack());
        System.out.println(hand2.isBusted());

        BlackJackHand hand3 = new BlackJackHand();
        hand3.addCard(new BlackJackCard(2, 5));
        hand3.addCard(new BlackJackCard(4, 9));
        hand3.addCard(new BlackJackCard(2, 13));
        System.out.println(hand3.getValue());
        System.out.println(hand3.isBlackjack());
        System.out.println(hand3.isBusted());

        BlackJackHand hand4 = new BlackJackHand();
        hand4.addCard(new BlackJackCard(2, 8));
        hand4.addCard(new BlackJackCard(1, 1));
        System.out.println(hand4.getValue());
        System.out.println(hand4.isBlackjack());
        System.out.println(hand4.isBusted());

        BlackJackHand hand5 = new BlackJackHand();
        hand5.addCard(new BlackJackCard(1, 7));
        hand5.addCard(new BlackJackCard(1, 9));
        hand5.addCard(new BlackJackCard(3, 1));
        System.out.println(hand5.getValue());
        System.out.println(hand5.isBlackjack());
        System.out.println(hand5.isBusted());

        BlackJackHand hand6 = new BlackJackHand();
        hand6.addCard(new BlackJackCard(2, 1));
        hand6.addCard(new BlackJackCard(1, 1));
        System.out.println(hand6.getValue());
        System.out.println(hand6.isBlackjack());
        System.out.println(hand6.isBusted());

    }
}
