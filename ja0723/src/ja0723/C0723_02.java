package ja0723;

import java.util.Scanner;

public class C0723_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 성적을 입력받아, 90점 이상 a, 80점 이상 b, 70점 이상 c, 60점 이상 d, 60점 미만 f를 출력하시오.
		Scanner scan = new Scanner(System.in);
//		System.out.println("성적을 입력하세요.>> ");
//		int score = scan.nextInt();
//		
//		// if else if else
//		
//		if (score>=90) {
//			System.out.println("A");
//		} else if(score>=80) {
//			System.out.println("B");
//		} else if(score>=70) {
//			System.out.println("C");
//		} else if(score>=60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
		
		// 해당 월을 입력받아,
		// if switch
		
		System.out.println("월을 입력하세요.>> ");
		int month = scan.nextInt();
		
		if(3 <= month || month >=5) {
			System.out.println("봄");
		} else if(6 <= month || month >=8) {
			System.out.println("여름");
		} else if(9 <= month || month >=11) {
			System.out.println("가을");
		} else {
			System.out.println("겨울");
		}
		
		switch(month) {
		case 3: case 4: case 5: 
			System.out.println("봄");
			break;
		
		case 6: case 7: case 8: 
			System.out.println("여름");
			break;

		case 9: case 10: case 11: 
			System.out.println("가을");
			break;

		case 12: case 1: case 2: 
			System.out.println("겨울");

		}
		

	}

}
