package ja0728;

import java.util.Scanner;

public class C0728_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a,b 입력받아 더하기 빼기 곱하기 나누기 계산을 하는 프로그램
		
		Cal c = new Cal();

		Scanner scan = new Scanner(System.in);
		System.out.println("두수를 입력하세요.>> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = 0;
		
		
		System.out.println("[ 사칙연산 프로그램 ]");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("원하는 번호를 입력하세요.>> ");
		
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:			
			result = c.add(a,b);
			System.out.println(result);
			break;
			
		case 2:
			result = c.minus(a,b);
			System.out.println(result);			
			break;
			
		case 3:			
			result = c.multiple(a,b);
			System.out.println(result);
			break;
			
		case 4:
			double result2 = c.div(a,b);
			System.out.println(result2);			
			break;
		}

	}

}
