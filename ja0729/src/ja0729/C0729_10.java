package ja0729;

import java.util.Scanner;

public class C0729_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 학생성적 입력
		
		Scanner scan = new Scanner(System.in);
		Stuscore[] s = new Stuscore[10];
		int n = 0; // 배열에 사용하는 번호
		
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			// 프로그램을 구현
			// 이름 국어 영어 수학 입력
			// 매개변수가 있는 생성자를 사용하여 저장하시오.
			// Stuscore 클래스 -> 초기화블럭사용해서 번호 증가
			System.out.printf("%d번째 이름을 입력하세요.>> ");
			String name = scan.next();
			System.out.printf("%d번째 학생의 국어 점수를 입력하세요.>> ");
			int kor = scan.nextInt();
			System.out.printf("%d번째 학생의 영어 점수를 입력하세요.>> ");
			int eng = scan.nextInt();
			System.out.printf("%d번째 학생의 수학 점수를 입력하세요.>> ");
			int math = scan.nextInt();
		
			s[n] = new Stuscore(name, kor, eng, math);
			
			
			// 입력 정보 : 1, 홍길동 , 100, 100, 99, 299,99.67
			// 입력 정보 : 1, 유관순, 90,90,91,271,90.33
			n++;
			break;
		}
		

	}

}
