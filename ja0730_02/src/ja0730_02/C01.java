package ja0730_02;

public class C01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 배열 5개를 선언
//		for 문을 사용해서 5개를 출력하시오.
//		1:1:1, 2:2:2, ... .5:5:5
		
		Time[] t = new Time[5];
		
//		t[0] = new Time(1,1,1);
//		t[1] = new Time(2,2,2);
//		t[2] = new Time(3,3,3);
//		t[3] = new Time(4,4,4);
//		t[4] = new Time(5,5,5);
		
		for(int i=0; i<t.length; i++) {
			t[i] = new Time(i+1,i+1,i+1);
			System.out.print(t[i]);
		}
		
		// t[1] = 12:59:30 수정하시오.
		
		t[1].setHour(12);
		t[1].setMinute(59);
		t[1].setSecond(30);
		
		System.out.println("--------");
		System.out.printf("%d시 %d분 %d초 입니다.", t[1].getHour(),t[1].getMinute(), t[1].getSecond());
		
		
				
//		Time t1 = new Time(10,10,10);
//		Time t2 = new Time();
//		t2.setHour(11);
//		t2.setMinute(11);
//		t2.setSecond(11);
//		System.out.println(t1);
		
		

	}

}
