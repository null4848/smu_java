package ja0730_02;

public class C02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck d = new Deck();
		
		// 모양, 번호가 포ㅎ함되어 있는 카드 52장을 생성
		d.deck_print();
		System.out.println("-----------");
		
		// 카드 섞기
		d.shuffle();
		System.out.println("-----------");
		
		// 카드 5장을 출력하시오.
		
		// 31번째 카드를 출력하시오.
		d.pick(31);
		System.out.println("-----------");
		
		// 랜덤으로 카드 한장을 출력하시오.
		d.pick();
		System.out.println("-----------");
		

	}

}
