package ja0728;

public class C0728_06 {
    public static void main(String[] args) {
        // 객체 3개 생성 예시
        Card c = new Card();
        c.kind = "spade";   // "space" → "spade" (오타 주의)
        c.number = 1;

        Card c2 = new Card();
        c2.kind = "spade";
        c2.number = 2;

        Card c3 = new Card();
        c3.kind = "spade";
        c3.number = 3;

        // 52개 카드를 배열로 초기화
        Card[] card = new Card[52];
        Card.width = 100;
        Card.height = 250;
        
        
        String[] shape = {"spade", "heart", "diamond", "clover"};

        int num = 0;
        for(int i=0; i<card.length; i++) {
            card[num] = new Card();         // 카드를 실제로 생성!
            card[num].kind = shape[i/13];
            card[num].number = i%13+1;         // 1~13로 할당
            num++;
        }

        for(int i=0; i<card.length; i++) {
            System.out.println(card[i].kind + "," + card[i].number);
        }
    }
}
