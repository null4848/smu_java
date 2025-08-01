package ja0728;

public class C0728_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C0728_12 c2 = new C0728_12();
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x: "+d.x);
		
		// 클래스 변수 - 객체 선언 업시 아숑ㅇ, 공용 사용, 믈래스명.변수명
		// 클래스 메소드 - 객체 선언 업시 아숑ㅇ, 공용 사용, 믈래스명.메소드명
		
		C0728_12.change(d.x);
		System.out.println("change 메소드 호출 후 d.x : "+d.x);
		

	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("x : "+x);
	}

}

class Data {
	int x;
}
