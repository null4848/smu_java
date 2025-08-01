package ja0730_02;

import ja0730_02.Card;

public class Deck {
	
	Card[] c = new Card[52];
	String[] shape = {"SPADE","HEART","DIAMOND","CLOVER"};

	Deck() {		
		for(int i=0;i<52;i++) {
			c[i] = new Card(i%13+1, shape[i/13]);
		}

	}
	
	// 카드 섞기 메소드
	void shuffle() {
		Card temp = null;
		int rnum=0;
		for(int i=0; i<300; i++) {
			rnum = (int)(Math.random()*52);
			temp = c[0];
			c[0]=c[rnum];
			c[rnum]=temp;
		}
		
		for(int i=0; i<52; i++) {
			System.out.printf("%d, %s \n", c[i].getNumber(), c[i].getKind());
		}
		
	}
	
	// 카드 5장 출력 메소드
	
	
	// 카드 1장 뽑기 메소드
	void pick(int index) {
		if(index>52 || index<0) {
			System.out.printf("%d, %s \n", c[0].getNumber(), c[0].getKind());

		} else {
			System.out.printf("%d, %s \n", c[index].getNumber(), c[index].getKind());

		}
	}
	
	// 랜덤 1장 메소드
	
	void pick() {
		int rnum = (int)(Math.random()*52);
		System.out.printf("%d, %s \n", c[rnum].getNumber(), c[rnum].getKind());
	}
	
	
	
	// 전체 출력 메소드
	void deck_print() {
		for(int i=0; i<52; i++) {
			System.out.printf("%d, %s \n", c[i].getNumber(), c[i].getKind());
		}
	}
	

}