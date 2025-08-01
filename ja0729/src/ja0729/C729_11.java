package ja0729;

public class C729_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stuscore s1 = new Stuscore();
//		System.out.println(s1.no);
//		Stuscore s2 = new Stuscore();
//		System.out.println(s2.no);
//		Stuscore s3 = new Stuscore("이순신",100,100,99);
//		System.out.println(s3.no);
//		Stuscore s4 = new Stuscore("강감찬",90,90,99);
//		System.out.println(s4.no);
		
		// 배열 서넝ㄴ
		Stuscore[] score = new Stuscore[4];
		
		score[0]=new Stuscore();
		score[1]=new Stuscore();
		score[2]=new Stuscore("이순신", 100,100,99);
		score[3]=new Stuscore("강감찬",90,90,99);
		System.out.println(score[0].no);
		System.out.println(score[2].name);
		

	}

}
