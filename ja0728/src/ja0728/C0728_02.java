package ja0728;

public class C0728_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv t = new Tv();
		t.color = "pink";
		t.channel = 7;
		System.out.println(t.color);
		System.out.println(t.channel); // 7

		
		Tv t2 = new Tv();
		t2.color = "white";
		t2.channel = 5;
		
		System.out.println(t2.color); 
		System.out.println(t2.channel); // 5
		t2= t;
		
		System.out.println("t2 : ts.chammel")
		; //7
		

	}

}
