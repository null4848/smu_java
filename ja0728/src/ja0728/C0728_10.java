package ja0728;

import java.util.Scanner;

public class C0728_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3개의 숫자를 입력받아 더하기 빼기 곱하기 나누기
		// 2개 -> 3개
		// Cal2.java를 만들어 구성하시오.
		
		
		Scanner scan = new Scanner(System.in);
		
		Cal2 c2 = new Cal2();
		
		System.out.println("1번째 숫자를 입력하세요.>> ");
		int a = scan.nextInt();
		System.out.println("2번째 숫자를 입력하세요.>> ");
		int b = scan.nextInt();
		System.out.println("3번째 숫자를 입력하세요.>> ");
		int c = scan.nextInt();
		
		System.out.println("원하는 번호를 선택하세요.>> ");
		System.out.println("--------------------------");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
	
		int choice = scan.nextInt();
		int result = 0;
		
		switch (choice) {
		case 1:
			
//			int result = c.add()
			break;
		}
		
		

	}

}
