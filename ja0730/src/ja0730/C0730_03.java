package ja0730;

public class C0730_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck d = new Deck();
		d.deck_print();
		
		d.shuffle();
		System.out.println("----");
		d.deck_print();
		System.out.println("----");
		Card c_one = d.pick(34);
		System.out.printf("1장 : %d,%s\n", c_one.number, c_one.kind);
		System.out.println("----");
//		c_one = d.pick();
		System.out.printf("1장 : %d,%s\n", c_one.number, c_one.kind);
	}

}
