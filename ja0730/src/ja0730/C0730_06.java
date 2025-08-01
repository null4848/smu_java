package ja0730;

public class C0730_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time();
//		t1.hour = 10; // 에러
		
		t1.setHour(10);
		System.out.println(t1.hour);
		System.out.println("시간 : "+t1.getHour());

	}

}
