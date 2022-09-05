package shuffler;

public class shuffleMain {
    public static void main(String[] args) {
        //52장의 카드 덱 생성

        Deck standardDeck = new Deck();

        for(int suit=1; suit<=4; suit++){
            for(int rank=1; rank<=13; rank++){
                Card newCard = new Card(rank,suit);

                standardDeck.addCard(newCard);
            }
        }

        //카드 섞기
        standardDeck.shuffle();
        // 딜링
        Deck hand1 = standardDeck.deal(5);
        Deck hand2 = standardDeck.deal(5);

        // 핸드출력
        hand1.print();
        System.out.println("--------------");
        hand2.print();
    }
}
