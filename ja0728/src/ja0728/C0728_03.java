package ja0728;

public class C0728_03 {

	public static void main(String[] args) {
		//StuScore 객체 - 홍길동 100 100 100
		// 객체 선언 - 유관순 90 90 91
		
		StuScore stu = new StuScore();
		
		stu.name = "홍길동";
		stu.kor = 100;
		stu.eng = 100;
		stu.math = 100;
		stu.total = stu.kor+stu.eng+stu.math;
		System.out.printf("%s,%d,5d,5d,d \n", stu.name, stu.kor, stu.math, stu.total);
		
		StuScore stu2 = new StuScore();
		stu2.name = "유관순";
		stu2.kor = 90;
		stu2.eng = 90;
		stu2.math = stu2.kor+stu2.eng+stu2.math;
		stu2.total = stu2.kor+stu2.eng+stu2.math;
		System.out.printf("%s,%d,5d,5d,d \n", stu2.name, stu2.kor, stu2.math, stu2.total);

		

		
		
		
		
	}

}
