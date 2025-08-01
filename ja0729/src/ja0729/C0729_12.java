package ja0729;

public class C0729_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pro[] p = new Pro[10];
//		p[0] = Pro();
		//serialNo 자동 부여 , 스마트폰
		
//		p[1] = 객체선언
//		p[2] = 객체선언
//		p[3] = 객체선언
//		p[4] = 객체선언
		
		// 객체 선언("스마트폰")
//		p[5] = Pro("스마트폰")		
//		p[6] = Pro("스마트폰")		
//		p[7] = Pro("스마트폰")		
//		p[8] = Pro("스마트폰")		
		
		p[0] = new Pro();
		System.out.println(p[0].serialNo);
		
		p[1] = new Pro();
		p[1].produceName ="스마트폰";
		System.out.println(p[1].produceName);
		p[2] = new Pro();
		p[2].produceName ="스마트폰";
		p[3] = new Pro();
		p[3].produceName ="스마트폰";
		p[4] = new Pro();
		p[4].produceName ="스마트폰";
		
		p[5] = new Pro("스마트폰");
		p[6] = new Pro("스마트폰");
		p[7] = new Pro("스마트폰");
		p[8] = new Pro("스마트폰");
		
	

	}

}
