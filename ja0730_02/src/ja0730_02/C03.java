package ja0730_02;

public class C03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null; //주소값 - 저장공간없음
		// 객체선언 - 저장공간 생김.
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null; // 주소값-저장공간
		
		Ambulance ab = new Ambulance();
		Ambulance ab2 = null;
		
		Car car2 = new Car();
		
		fe.water();
		car = fe; // (Car)fe; // 형변환 생략
//		car.water(); // 에러 Car객체 water 기느 ㅇ없음
		fe2 = (FireEngine)car;
		fe2.water();
		
		fe2 = (FireEngine)car2;
		fe2.water();
		
		car = ab;
		fe2 = (FireEngine)car;

	}

}

